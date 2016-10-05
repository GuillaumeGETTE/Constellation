helloWorld: helloWorld.o
	$(CC) $(LDFLAGS) helloWorld.o -o helloWorld

helloWorld.o: helloWorld.c
	$(CC) $(CFLAGS) -c helloWorld.c

clean:
	rm *.o helloWorld
