package wrapperclasses;

public class DataConversion {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//String to integer conversion 
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		/*
		 * String y="100A"; int j=Integer.parseInt(y); System.out.println(j+20);
		 */
		// String to double
		String y="100.22";
		double j=Double.parseDouble(y);
		System.out.println(j+20);
		
		// int to String 
		int total=1000;
		String t=String.valueOf(total+10);
		System.out.println(t);
		
		double tt=50.55;
		String t1=String.valueOf(tt+45);
		System.out.println(t1);
		
		// String to boolean:
		String p="true";
		boolean flag=Boolean.parseBoolean(p);
		if(flag) {
			System.out.println("PASS");
		}
		
		// boolean to String
		boolean f=true;
		String f1=String.valueOf(f);
		System.out.println(f1+20);
		
		// String to long:
		String pop="10000000";
		long dist=Long.parseLong(pop);
		System.out.println(dist+345);
	}

}
