package OOP_encapsulation;

public class LoginPage {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(userName==null) {
			System.out.println("Please give the proper value");
			// blank return or, no return 
			return;
		}
		this.userName = userName;	
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
