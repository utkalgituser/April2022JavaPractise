package datatypes;

public class MathematicalOperation {

	public static void main(String[] args) {
		System.out.println(9/3);
		// returns integer 
		System.out.println(9/2); // 4
		System.out.println(9.0/2); // 4.5
		System.out.println(9/2.0); // 4.5
		System.out.println(9.0/2.0); // 4.5
		
		System.out.println(0/2); // 0
		// System.out.println(9/0); // java.lang.ArithmeticException:
		
		System.out.println(0.0/0.0); // NaN
		System.out.println(0/0.0); // NaN
		System.out.println(0.0/0); // NaN
		System.out.println(9.0/0); // Infinity
		
		System.out.println(9%2); // 1
		System.out.println(10%2); // 0
		System.out.println(100%3); // 1
		
		System.out.println('a'%97); // 0
		System.out.println('a'/97); // 1
		System.out.println('b'%'a'); // 1
		System.out.println('a'%'b'); // 97
		System.out.println('1'*'b'); // 4802
		System.out.println('1'%'b'); // 49
		System.out.println("ghdsfd"+'1'+'b'); // ghdsfd1b
		
        char ch = 'A';
        
        System.out.println(++ch);
        
        int ch1 = 'A';
        
        System.out.println(ch1++);

	}

}
