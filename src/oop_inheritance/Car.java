package oop_inheritance;

public class Car extends Vehicle {
	
	int speed = 100;
	String name;
	int price;
	
	public Car() {
		System.out.println(speed);
	}
	
	public Car(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
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
	
	private  void billing() {
		System.out.println("car billing");
	}
	
	@Override
	public void aeroDynamic() {
		System.out.println("Car - aeroDynamic");
	}
}
