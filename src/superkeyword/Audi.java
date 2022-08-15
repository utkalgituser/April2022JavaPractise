package superkeyword;

public class Audi extends Car {

	int speed = 200;
	
	public Audi() {
		System.out.println(" Audi constructor ");
	}
	
	public Audi(int a) {
		System.out.println(" Audi constructor "+a);
	}
	
	// to call parent class members use super keyword
	// without creating the object we can access the properties of the parent class
	@Override
	public void start() {
		System.out.println("Audi - speed");
		super.start();
	}

	public void getSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}
}
