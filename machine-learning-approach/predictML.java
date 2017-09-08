    
public class predictML {
	public static String[] salles = new String[]{"S1","S2","S3","SC"};
	public static float[] normalise(int[] power){
		float[] powerNormalised = new float[power.length];
		float sum = 0;
		for(int i=0; i<power.length; i++){
			float temp = (float) Math.pow(10.0,power[i]/10);
			sum+=temp;
			powerNormalised[i]=temp;
		}
		for(int i=0; i<power.length; i++){
			powerNormalised[i]=powerNormalised[i]/sum;
		}
		return powerNormalised;
	}
	public static void main(String[] args) throws Exception {
		int[] power = new int[args.length];
		for(int i=0; i< args.length;i++){
			power[i]=Integer.parseInt(args[i]);
		}
		float[] powerNormalised = normalise(power);
		Double[] powerValue= new Double[powerNormalised.length];
		for(int i=0; i< powerNormalised.length;i++){
			powerValue[i]=new Double((double) powerNormalised[i]);
		}
		System.out.println(salles[(int)simplePredict.classify(powerValue)]);
	}

}
