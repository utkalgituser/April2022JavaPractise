package accessmodifier;

public class Car {

	public String name;
	private int price;
	protected String color;
	String licenseNumber;

	public static void main(String[] args) {
		Car c = new Car();

		final int i = 10;
	}

	// Do same with methods with difference access modifiers

	public static void horn() {
		// static, private,  protected access modifiers are not allowed within the method
		final int j = 10;
		// j=20;
	}

}
