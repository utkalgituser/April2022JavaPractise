package oop_inheritance;

public class Car extends Vehicle {

	int speed = 100;
	String name;
	int price;

	public Car() {
		System.out.println(speed);
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// final:
	//1. to provide constant variables
	//2. to prevent inheritance 
	//3. to prevent method overriding 
	public void start() {
		System.out.println("car start");
	}

	public void stop() {
		System.out.println("car stop");
	}

	public void refuel() {
		System.out.println("car refuel");
	}

	public static void run() {
		System.out.println("car run");
	}

	private void billing() {
		System.out.println("car billing");
	}

	@Override
	public void aeroDynamic() {
		System.out.println("Car - aeroDynamic");
	}
	
	public static void idling() {
		System.out.println("this is static - idling");
	}
}
