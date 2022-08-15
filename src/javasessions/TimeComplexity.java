package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// O(n) - BIG O of n (BIG O notation)

		int i = 1; // O(1) - constant time only once will be executed
		int j = 1;
		System.out.println(j + i); // O(1) - constant time only once will be executed

		// 1 to 10 print
		for (int p = 1; p <= 10; p++) {
			System.out.println(p); // O(10) - constant time only 10 times will be executed
		}

		// 1+n+n+n=> 3n+1 (linear equation) --> 3n -> n -> O(n) or, O(3n)
		// As 1 is very less and insignificant, so removed from equation above
		// )(3n+1) -->

		// nested for loop
		for (int m = 0; m <= 9; m++) {
			for (int n = 0; n <= 9; n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
		}

		// (1+n+n+n)(1+n+n+n) -->(1+3n)(1+3n) => 1+3n+3n+9n^2 => 1+6n+9n^2
		// 9n^2+6n+1 (quadratic equation) => 9n^1+6n ==> 3n(3n+2) => 3n(3n)
		// 9n^2 => O(n^2)

		for (int m = 0; m <= 9; m++) {
			for (int n = 0; n <= 9; n++) {
				for (int q = 0; q <= 9; q++) {
					System.out.print(m + "" + n + "" + q + " ");
				}
				System.out.println();
			}
		}
		// Homework find time complexity
		// (1+n)(1+n)(1+n) => n^3+n^2+n+1
		// 
		// O(log n) algorithm --> BST
	}
}