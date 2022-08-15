package OOP_encapsulation;

public class TestUser {

	public static void main(String[] args) {

		// Here constructor is acting like setter
		
		// Create:POST
		User u1 = new User("Nikita", 25, true);
		
		// Retrieve: GET 
		System.out.println(u1.getName());
		System.out.println(u1.getSharePrice());
		System.out.println(u1.isActive());
		System.out.println("--------------");

		// UPDATE:PUT/PATCH
		u1.setActive(true);
		System.out.println(u1.getName());
		System.out.println(u1.getSharePrice());
		System.out.println(u1.isActive());
		System.out.println("--------------");
		u1.setName("Nikita sinha");
		System.out.println(u1.getName());
		System.out.println(u1.getSharePrice());
		System.out.println(u1.isActive());
		System.out.println("--------------");
	}
}
