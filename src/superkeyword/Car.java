package superkeyword;

public class Car {

	protected int speed = 100;
	
	public Car() {
		System.out.println(" car constructor");
	}
	
	public Car(int a) {
		System.out.println(" car constructor "+a);
	}
	
	public void start() {
		System.out.println("Car - speed");
	}
}
