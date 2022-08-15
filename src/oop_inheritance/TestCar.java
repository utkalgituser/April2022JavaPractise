package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); // Overridden
		b.stop(); // inherited
		b.autoParking(); // individual
		b.refuel(); // inherited
		b.engine();
		BMW.run();
		System.out.println(b.speed);
		b.aeroDynamic();

		System.out.println("--------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.run();
		c.aeroDynamic();

		System.out.println("--------------");
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.theftSafety();
		a.engine();

		System.out.println("--------------");

		Automobile au = new Automobile();
		au.aeroDynamic();

		System.out.println("--------------");
		// Top casting
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable
		c1.start();
		c1.engine();
		c1.stop();
		c1.refuel();
		Car.run();

		System.out.println("--------------");
		// Here reference type check will be applicable to check if the method is
		// present in parent class, parent class can't access the child class methods.
		Vehicle c2 = new BMW();
		c2.aeroDynamic();
		c2.engine();
		
		// Down casting. Compile time will work
		// will get ClassCastException at run time
		BMW b1=(BMW) new Car();
		
		
		// University, Technical University, Colleges (Home Work)
		// call constructor chaining till super class
	}

}
