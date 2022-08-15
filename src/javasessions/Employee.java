package javasessions;

public class Employee {
	
	// class: template, category of all the objects, blueprint for all objects
	// data members: variables, methods
	String name;
	int age;
	double salary;
	int id;
	
	public static void main(String[] args) {
		
		// create the object of employee class: use new key word
		// RHS is the object, e1 is the reference of object
		Employee e1=new Employee();
		e1.age=22;
		e1.name="utkal";
		e1.salary=37.66;
		e1.id=232334;
		System.out.println(e1.id+" , "+e1.name+" , "+e1.age+" , "+e1.salary);
		Employee e2=new Employee();
		System.out.println(e2.id+" , "+e2.name+" , "+e2.age+" , "+e2.salary);
		Employee e3=new Employee();
		e3.age=28;
		e3.name="sachin";
		System.out.println(e3.id+" , "+e3.name+" , "+e3.age+" , "+e3.salary);
		
		// no reference object
		new Employee().id=564;
		new Employee().name="Tom";
		
		// null reference object
		Employee e4=new Employee();
		e4=null;
		// e4.id=101;
		
		// Still no guarantee GC will come , it depends on JVM
		// Garbage collector will never come into stack 
		System.gc();
	}

}
