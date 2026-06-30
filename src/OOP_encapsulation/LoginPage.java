package OOP_encapsulation;

public class LoginPage {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName == null) {
			System.out.println("userName value is null, Please give the proper value");
			// blank return or, no return
			// comes out of function
			return;
		}
		if (userName.isBlank()) {
			System.out.println("userName value is blank, Please give the proper value");
			// blank return or, no return
			// comes out of function
			return;
		}
		System.out.println("userName is " + userName);
		this.userName = userName;
		System.out.println("Outside if loop");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
