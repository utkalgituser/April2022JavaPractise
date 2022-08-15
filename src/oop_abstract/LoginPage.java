package oop_abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LoginPage - cobstructor");
	}
	
	@Override
	public void title() {
		System.out.println("Login page - title");
	}

	@Override
	public void url() {
		System.out.println("Login page - url");

	}

	@Override
	public void header() {
		System.out.println("Login page - heeader");
	}
	
	public void doLogin(String uname, String pwd) {
		System.out.println("Login with "+ uname +" , "+pwd);
	}
	
	
}
