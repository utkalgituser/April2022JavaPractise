package javasessions;

public class MailApp {

	int price; // copy of the price will be stored inside the object of this class
	static String name = "gmail"; // CMA

	public void sendMail() { // copy of the price will be stored inside the object of this class
		System.out.println("send mail");

	}

	public static void sendInfo() {
		System.out.println("send info");
	}
	
	// Main method is called by JVM and works as a caller methood. That's why main is static and void
	// Object should be created by user not by JVM
	public static void main(String[] args) {
		MailApp ma = new MailApp();
		// Non static method access by object ref
		ma.sendMail();

		// static method my Class name
		MailApp.sendInfo();

		// call directly
		sendInfo();
	}

}
