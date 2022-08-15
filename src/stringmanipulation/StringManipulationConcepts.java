package stringmanipulation;

import java.util.Arrays;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		String str = "this is my java code and i am happy";
		System.out.println(str.length());
		int len = str.length();
		int hi = len - 1;
		int lo = 0;
		System.out.println("li =" + lo);
		System.out.println("hi =" + (len - 1));
		System.out.println("length is =" + len);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(34));
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('i', 3)); // 1st occurrence
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 2nd occurrence
		// find 3rd occurrence of i

		System.out.println(str.indexOf("java"));
		// return of this -1, if not found
		System.out.println(str.indexOf("utkal"));

		String mesg = "Welcom Admin";
		if (mesg.lastIndexOf("admin") != -1) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		String st = "this is my first java code";
		System.out.println(st.toUpperCase());
		String st1 = "THIS IS MY JAVA PROGRAM";
		System.out.println(st1.toLowerCase());

		// trim:
		String s = " hello world   ";
		System.out.println(s);
		System.out.println(s.trim());

		// replace:
		String dob = "01-01-2020"; // 01/01/2020
		System.out.println(dob.replace("-", "/"));
		String s1 = " hello world   ";
		System.out.println(s1.replace(" ", ""));

		// contains:
		String m = "Your user id is utkalbarik";
		System.out.println(m.contains("utkalbarik ")); // contains returns true or false
		if (m.contains("id")) {
			System.out.println("PASS");
		} else {
			System.out.println("FALSE");
		}

		// equals:
		// String literals
		String p = "hello selenium";
		String k = "hello Selenium ";
		System.out.println(p.equals(k)); // returns boolean
		System.out.println(k.trim().equalsIgnoreCase(p));

		System.out.println("-----");
		String h = new String("hello world");
		String g = new String("hello world");
		System.out.println(h == g);
		System.out.println(h.equals(g));
		System.out.println("---------");
		String p1 = "hello selenium";
		String k1 = "hello selenium";
		System.out.println(p1 == k1);

		// substring:
		String test = "your order id is 12345";
		System.out.println(test.substring(3));
		System.out.println(test.substring(5, 22));
		System.out.println(test.substring(test.indexOf("is")+3, test.length()));
		
		// split
		String lang="JAVA_PYTHON";
		System.out.println(Arrays.toString(lang.split("_")));
		String pool="xXtestingXxXxXpythonXxXautomation";
		String[] pl=pool.split("xX");
		// because there is nothing before xX
		System.out.println(pl[0]);
		System.out.println(pl[1]);
		System.out.println(pl[2]);
		System.out.println(pl[3]);
		// [, testingX, , pythonX, automation]
		System.out.println(Arrays.toString(pl));
		
		
		
	}

}
