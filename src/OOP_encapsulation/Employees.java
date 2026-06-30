package OOP_encapsulation;

public class Employees {

	// constructor looks like a function not a function
	// constructor can't return a value but function may or, may not return anything 
	// constructor name should be same as class name, but function may or, may not return a value
	// constructor will be called when you create the object but the function is called with object reference 
	// this and super key word is used with constructor but not with function
	// constructor is used to initialize the class variables
	// constructor is used to restrict of creating the unnecessary object and 
	// constructor should not have the business/application logic 
	// business logic should be inside the function 
	
	private String name;
	private int age;
	public String city="bangaluru";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
