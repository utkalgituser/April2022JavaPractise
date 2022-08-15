package javasessions;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		User u1=new User();
		u1.name="Pooja";
		u1.age=34;
		u1.city="mumbai";
		
		User u2=new User();
		u2.name="Vinu";
		u2.age=14;
		u2.city="cuttack";

		User u3=new User();
		u3.name="chetan";
		u3.age=24;
		u3.city="LA";
		
		System.out.println(u1.name+" . "+u1.age+" , "+u1.city);
		System.out.println(u2.name+" . "+u2.age+" , "+u2.city);
		System.out.println(u3.name+" . "+u3.age+" , "+u3.city);
		System.out.println("---------------");
		u1=u2;
		System.out.println(u1.name+" . "+u1.age+" , "+u1.city);
		System.out.println(u2.name+" . "+u2.age+" , "+u2.city);
		System.out.println(u3.name+" . "+u3.age+" , "+u3.city);
		System.out.println("---------------");
		u2=u3;
		System.out.println(u1.name+" . "+u1.age+" , "+u1.city);
		System.out.println(u2.name+" . "+u2.age+" , "+u2.city);
		System.out.println(u3.name+" . "+u3.age+" , "+u3.city);
		
		System.out.println("---------------");
		u3=u1;
		System.out.println(u1.name+" . "+u1.age+" , "+u1.city);
		System.out.println(u2.name+" . "+u2.age+" , "+u2.city);
		System.out.println(u3.name+" . "+u3.age+" , "+u3.city);
		
		
		// HW create 4 object and swap reference variables
	}

}
