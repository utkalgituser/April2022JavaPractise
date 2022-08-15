package oop_inheritance;

public class BMW extends Car {

	// Method overriding: dynamic poly + morphism
	// When u have a method in parent class and same method in child class with:
	// 1. method name should be same
	// 2. same number of parameters
	// 3. same type of parameters
	// 4. same sequence of parameters
	// 5. same return type
	// 6. Multiple inheritance is not allowed in java using class. Also called
	// Diamond problem.
	// 7. Multilevel is inheritance is allowed in java

	// 8. If a static method is available in parent class and same is available in
	// child class, then this is called method hiding. 
	// final, static and private methods can't be overridden
	// final: 
	// 1. to provide constant
	//2. to prevent inheritance
	// 3. to prevent method overriding 
	
	int speed =200;
	
	public BMW() {
		// Super should be the first line of child class constructor
		// can be used inside methods also
		super();
		System.out.println("testing");
	}
	
	@Override
	public void start() {
		System.out.println("BMW -start");
	}

	public void autoParking() {
		System.out.println("BMW -autoParking");
	}

	@Override
	public void engine() {
		System.out.println("BMW - engine");
	}

	public static void run() {
		System.out.println("BMW run");
	}
	
	// it's a separate private method @override can't be used
	private void billing() {
		System.out.println("BMW billing");

	}
}
