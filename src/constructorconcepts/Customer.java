package constructorconcepts;

import java.util.List;

public class Customer {

	String firstname;
	String lastname;
	boolean isPrime;
	String phone;
	String address;
	String email;
	List<String> orderList;

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

	public Customer(String firstname, String lastname, List<String> orderList) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", isPrime=" + isPrime + ", phone="
				+ phone + ", address=" + address + ", email=" + email + ", orderList=" + orderList + "]";
	}

}
