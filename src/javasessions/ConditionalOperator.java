package javasessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		if (i == j) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
		if (j >= i) {
			System.out.println("j is greater");
		}

		if (true) {
			System.out.println("bye");
		}
		// dead code
		/*
		 * else { System.out.println("hi"); }
		 */

		// Cannot switch on a value of type double. Only convertible int values, strings
		// or enum variables are permitted

		String env = " QA ";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("This is qa env");
			break;
		case "prod":
			System.out.println("This is prd env");
			break;
		case "stage":
			System.out.println("This is staging env");
			break;
		default:
			System.out.println("This is default env");
			break;
		}

		int x = 400;
		int y = 400;
		int z = 300;

		// && is short circuit operator
		// If x > y is false then it will not check for x > z condition. It will skip

		// & is operator is will check both condition.
		if (x > y && x > z) { // false && true = false
			System.out.println("x is greatest number");
		} else if (y > z) {
			System.out.println("y is greatest");
		} else {
			System.out.println("z is greatest");
		}

		int l = 1;
		while (l <= 10) {
			System.out.println(l);
			int x1 = l++;
			System.out.println(x1 + " , " + l);
		}
		byte b1=20;
		byte b2=3;
		int b3=b1+b2;
		System.out.println("---------------");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);


	}

}
