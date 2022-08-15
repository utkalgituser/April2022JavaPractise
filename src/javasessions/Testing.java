package javasessions;

public class Testing {

	// any non static method can access any other non static method without creating
	// object in the same class
	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		System.out.println("BYE");
	}

	public static void main(String[] args) {
		Testing obj = new Testing();
		obj.m1();
	}

}
