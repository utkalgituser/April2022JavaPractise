package stringmanipulation;

import java.util.Arrays;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		String str = "this is my java code and i am so happy";
		System.out.println("Length is: " + str.length());
		int len = str.length();
		int highestIndex = len - 1;
		int lowestIndex = 0;
		System.out.println("lowestIndex = " + lowestIndex);
		System.out.println("highestIndex = " + (len - 1));
		System.out.println("length is = " + len);

		System.out.println("char at 0 position " + str.charAt(0));
		System.out.println("char at 34 position " + str.charAt(34));
		// System.out.println(str.charAt(38)); // StringIndexOutOfBoundsException
		System.out.println("index of m " + str.indexOf('m'));
		System.out.println("index of t " + str.indexOf('t'));
		System.out.println("1st occurrence of i " + str.indexOf('i'));
		System.out.println("2nd occurrence of index of i " + str.indexOf('i', 3));
		System.out.println("2nd occurrence of index of i " + str.indexOf('i', str.indexOf('i') + 1)); // with generic
		// find 3rd occurrence of i
		System.out.println(
				"3rd occurrence of index of i " + str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));
		System.out.println("char at position is " + str.charAt(25));

		System.out.println("position of String java " + str.indexOf("java"));
		// return of this -1, if not found
		System.out.println("position of String utkal " + str.indexOf("utkal"));
		System.out.println("position of String Java " + str.indexOf("Java"));

		String mesg = "Welcome Admin";
		if (mesg.lastIndexOf("admin") != -1) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		String st = "this is my first java code";
		System.out.println(st.toUpperCase());
		String st1 = "THIS IS MY JAVA PROGRAM";
		System.out.println(st1.toLowerCase());

		// trim: removes space only from corners i.e. starts and end
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
		String h = new String("hello world"); // 2 objects, 1 in SCP and other in heap
		String g = new String("hello world"); // only 1 object i.e. in heap as "hello world" in already in SCP
		System.out.println(h == g);
		System.out.println(h.equals(g));
		System.out.println("---------");
		String p1 = "hello selenium"; 
		String k1 = "hello selenium"; 
		System.out.println(p1 == k1);
		String l = "hello world"; // no object creation in SCP as "hello world" is already present  
		
		// substring:
		String test = "your order id is 12345";
		System.out.println("Substring from 3rd position- " + test.substring(3));
		System.out.println(test.substring(5, 22));
		System.out.println(test.substring(test.indexOf("is") + 3, test.length()));

		// split
		String lang = "JAVA_PYTHON";
		System.out.println(Arrays.toString(lang.split("_")));
		String pool = "xXtestingXxXxXpythonXxXautomation";
		String[] pl = pool.split("xX");
		// because there is nothing before xX
		System.out.println(pl[0]);
		System.out.println("length is " + pl[0].length());
		System.out.println(pl[1]);
		System.out.println(pl[2]);
		System.out.println(pl[3]);
		System.out.println(pl[4]);
		// [, testingX, , pythonX, automation]
		// Arrays.toString(pl) is not same as pl.toString()
		System.out.println(Arrays.toString(pl));

	}

}
