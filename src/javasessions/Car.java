package javasessions;

public class Car {

	String name;
	int price;
	String color;
	// static value will be stored in CMA - common memory allocation or, PG
	// -permanent generation
	// After JDK 8 its called meta space.
	static int wheels = 4;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "red";

		Car c2 = new Car();
		c2.name = "BMW";
		c2.price = 30;
		c2.color = "red";

		Car c3 = new Car();
		c3.name = "BMW";
		c3.price = 30;
		c3.color = "red";
		
		// access static variable using Class name
		System.out.println(c1.name + c1.color + c1.price + Car.wheels);
		// access static variable directly
		System.out.println(wheels);
	}

}
