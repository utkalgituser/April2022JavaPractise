package exceptionhandling;

public class Company {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		try {
			m3();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void m3() {
		System.out.println("m3");
		int i = 9 / 0;
		System.out.println(i);
	}

	public static void main(String[] args) {

		Company c = new Company();
		c.m1();

		System.out.println("bye");
	}

}
