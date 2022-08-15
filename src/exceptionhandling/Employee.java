package exceptionhandling;

public class Employee {

	String name="utkal";
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee e=new Employee();
			// e=null;
			System.out.println(e.name);
			int i = 9 / 0;
		} catch (Exception e) {
			System.out.println("AE is coming.... ");
			e.printStackTrace();
		}

		System.out.println("bye");
	}

}
