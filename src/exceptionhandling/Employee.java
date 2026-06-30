package exceptionhandling;

public class Employee {

	String name = "utkal";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee e = new Employee();
			// e = null;
			System.out.println(e.name);
			int i = 9 / 0;
			System.out.println("is is " + i);
		} catch (ArithmeticException e) {
			System.out.println("AE is coming.... ");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming.... ");
			e.printStackTrace();
		}

		System.out.println("bye");
	}

}
