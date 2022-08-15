package constructorconcepts;

public class User {
	
	String id;
	String name;
	int age;
	boolean isActive; 
		
	public User(String id) {
		this.id = id;
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(String id, boolean isActive) {
		super();
		this.id = id;
		this.isActive = isActive;
	}

	public User(String id, String name, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}

	public User(String id, String name, int age, boolean isActive) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		
		User u1=new User("101");
		User u3=new User("101", "Tom", true);
		User u2=new User("121", "Mary", 34);
		User u4=new User("121", "Sean", 34, false);
		User u5=new User("121", false);
		
	}

}
