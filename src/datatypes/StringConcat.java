package datatypes;

public class StringConcat {

	public static void main(String[] args) {

		// "+" is addition operator if used with numeric value, and it is concatenation
		// operator if used with string
		String s = "Hello world";
		System.out.println(s);
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "seelnium";
		// Execution always happens from left to right hand sides
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		// code within braces will execute first
		System.out.println(x + y + (a + b));
		System.out.println("sum is " + (a + b));
		
		// ASCII table value range
		// a-z is 97 to 122
		// A-Z is 65 to 90
		// 0-9 is 48 to 57
		char c1 = 'a'; // 97 
		char c2 = 'b'; // 98
		System.out.println(c1);
		System.out.println(c1 + c2); // 97+98=195
		char c3='9';
		System.out.println(c3);
		
		// to know SCII value of character
		System.out.println((int)c3);
		System.out.println(c3+10);// ASCII value for 9 is 57
		System.out.println(c3-c2); // 57-98
		
		// char will be converted to string
		System.out.println(c1+"");
		System.out.println(x+c1+c2);
		// code will be added first 
		System.out.println(x+(c1+c2));
		System.out.println((int)c1+(int)c2);
		System.out.println((int)c1+(int)c2+"");
	}

}
