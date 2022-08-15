package constructorconcepts;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isPerm;

	// Constructor - name will be same as class name
	// Constructor - special kind of function
	// Constructor - doesn't return anything
	// Constructor - will be called while creating object of the class
	// Constructor - can be overloaded
	// Constructor - used to initialize class variable
	// Constructor - used to create object based requirement 
	// Constructor - unnecessary object creation blocked like default constructor

	/*
	 * public Employee() { // default constructor
	 * System.out.println("default constructor"); }
	 * 
	 * public Employee(int age) { // 1 parameter constructor
	 * System.out.println("1 parameter constructor " + age); }
	 * 
	 * public Employee(String name, int age) { // 2 parameter constructor
	 * System.out.println("2 parameter constructor " + name + " , " + age); }
	 */
	
	public Employee(String name, int age) { // 2 parameter constructor
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee(); Employee e2 = new Employee(10);
		 */
		Employee e3 = new Employee("Neel", 10);
		System.out.println("2 parameter constructor " + e3.name + " , " + e3.age);

		
		/*
		 * e1.name = "Tommy"; e1.age = 20; e1.salary = 12.33; e1.isPerm = true;
		 */

	}

}
