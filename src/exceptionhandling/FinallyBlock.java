package exceptionhandling;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
		} /*
			 * catch (ArithmeticException e) { System.out.println("AE exception... ");
			 * e.printStackTrace(); }
			 */ finally {
			System.out.println("Inside finally block");
		}
		System.out.println("bye");
	}
}
