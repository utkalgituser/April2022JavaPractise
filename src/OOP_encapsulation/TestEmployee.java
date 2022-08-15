package OOP_encapsulation;

public class TestEmployee {
	
	public static void main(String[] args) {
	Employees emp=new Employees();
	System.out.println(emp.getAge());
	
	LoginPage lp=new LoginPage();
	lp.setUserName("utkal");
	System.out.println(lp.getUserName());
	lp.setUserName(null);
	System.out.println(lp.getUserName());
	}
}
