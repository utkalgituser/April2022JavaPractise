package javasessions;

import java.util.Arrays;
import java.util.Collections;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] i = new int[4];
		int len = i.length;
		System.out.println("length is = " + len);
		int li = 0;
		int hi = 3;
		System.out.println("hi = " + (len - 1));
		System.out.println("li = " + li);
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// System.out.println(i[4]); // java.lang.ArrayIndexOutOfBoundsException:
		int[] marks = new int[4];
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		for (int i1 = 0; i1 <= marks.length - 1; i1++) {
			System.out.println("mark is = " + marks[i1]);
		}
		System.out.println(Arrays.toString(marks));
		System.out.println(marks[2]);
		Object[] obj = new Object[4];
		obj[0] = "fghfghg";
		obj[1] = 20;
		obj[2] = 12.55;
		obj[3] = false;
		System.out.println(Arrays.toString(obj));
		
		Integer[] marksNew= {45,85,48,36,97,55};
		System.out.println(marksNew.length);
		System.out.println(Arrays.toString(marksNew));
		// Sort in reverse order an array
		Arrays.sort(marksNew, Collections.reverseOrder());
		System.out.println(Arrays.toString(marksNew));
	}
}
