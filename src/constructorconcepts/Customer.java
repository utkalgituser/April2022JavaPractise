package constructorconcepts;

import java.util.ArrayList;

public class Customer {
	
	String firstname;
	String lastname;
	boolean isPrime;
	String phone;
	String address;
	String email;
	ArrayList<String> orderList;
	
	public Customer(String firstname, String phone, String email) {
		super();
		this.firstname = firstname;
		this.phone = phone;
		this.email = email;
	}

	public Customer(String firstname, String phone, String address, String email) {
		super();
		this.firstname = firstname;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public Customer(String firstname, boolean isPrime, String phone, String email) {
		super();
		this.firstname = firstname;
		this.isPrime = isPrime;
		this.phone = phone;
		this.email = email;
	}

	public Customer(String firstname, String lastname, ArrayList<String> orderList) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.orderList = orderList;
	}
	
	
	
}
