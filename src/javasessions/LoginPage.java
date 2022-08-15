package javasessions;

import java.util.Arrays;

public class LoginPage {

	String name;
	String passwd;
	boolean isActive;
	double bmi;
	int age;
	char gender;
	String st[] = { "tomm", "lisa", "chetan", "kuku" };

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		System.out.println(lp);
		System.out.println(lp.name);
		System.out.println(lp.passwd);
		System.out.println(lp.isActive);
		System.out.println(lp.bmi);
		System.out.println(lp.age);
		System.out.println(lp.gender);
		System.out.println(lp.st.length);
		System.out.println(Arrays.toString(lp.st));
		for (String e : lp.st) {
			System.out.println(e);
		}
	}

}
