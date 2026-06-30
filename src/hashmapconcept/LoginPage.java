package hashmapconcept;

import java.util.HashMap;
import java.util.Map;

public class LoginPage {

	public static void main(String[] args) {

		String cred = getUserCred("admin");
		System.out.println("credential is "+cred);

		String[] creds = cred.split(":");
		String uname = creds[0];
		String pwd = creds[1];
		doLogin(uname, pwd);
	}

	public static void doLogin(String uname, String pwd) {
		System.out.println("User logged in with " + uname + " , " + pwd);
	}

	// reg form:
	// admin, naveen:naveen@gmail.com:naveen@123:bangalore:india:560011

	public static String getUserCred(String role) {
		Map<String, String> credentialMap = new HashMap<>();
		credentialMap.put("admin", "admin@amazon.com:admin123");
		credentialMap.put("seller", "seller@amazon.com:seller123");
		credentialMap.put("partner", "partner@amazon.com:partner123");
		credentialMap.put("vendor", "vendor@amazon.com:vendor123");
		credentialMap.put("customer", "customer@amazon.com:customer123");
		return credentialMap.get(role);
	}
}
