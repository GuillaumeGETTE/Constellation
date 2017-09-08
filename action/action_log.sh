#!/bin/ash

# Example script

# Use this script as a wpa_cli callback to log to /tmp/test-constellation, for every new client connecting to the network :
# the room `piece` (classic algorithm with no machine learning)
# the coordinates `args`
# the room `salle` (machine learning-based algorithm)

# To run this a as wpa_cli callback:
#    wpa_cli -p /var/run/hostapd -a /path/to/this/script [-B for background running]


# $3 is the MAC address of the client

case "$2" in
    AP-STA-CONNECTED)
        echo "$3 just connected to the network"
        sleep 4
		data=`hnet-constellation print $3`
		if [ -z "$data" ]
		then
			echo "Erreur, pas de données reçues."
		else
			let "k = 0"
			let "n = 0"
			let "nb = 0"
			arg=""
			piece=""
			for word in $data
			do
				if [ $k -eq 2 ]
				then
					nb=`expr "$word" : '\([0-9]*\)'`
				elif [ $k -lt $((5+nb)) -a $k -gt 4 ]
				then
					nb=`expr "$word" : '\([0-9]*\)'`
					arg="$arg $nb"
				elif [ $k -eq $((7+nb)) ]
				then
					if [ $n -ne $nb ] 
					then
						piece=$word
					fi
				fi
				let "k += 1"
			done
			salle=`jamvm -cp /java/ predictML $arg`
			result='echo $piece; echo $arg; echo $salle;'
			eval $result >> /tmp/test-constellation
		fi
        ;;
    AP-STA-DISCONNECTED)
        echo "$3 just disconnected from the network"
        ;;
esac
