package datatypes;

public class IncrementDecementOperator {
	public static byte b2;
	public static int b3;
	public static void main(String[] args) {
		System.out.println(b2);
		System.out.println(b3);
		byte b1 = 1;
		b1 = (byte) (b1 + 1);
		System.out.println(b1);

		// post increment
		byte i1 = 5;
		byte j1 = i1++;
		System.out.println(i1 + " , " + j1);// 6,5
		byte p1 = -89;
		byte q1 = p1++;
		System.out.println(p1 + " , " + q1);// -88 , -89

		// pre increment
		byte i2 = 2;
		byte j2 = ++i2;
		System.out.println(i2 + " , " + j2);// 3, 3
		byte p2 = -89;
		byte q2 = ++p2;
		System.out.println(p2 + " , " + q2);// -88 , -88

		// post decrement
		byte i3 = 5;
		byte j3 = i3--;
		System.out.println(i3 + " , " + j3);// 4,5
		byte p3 = -89;
		byte q3 = p3--;
		System.out.println(p3 + " , " + q3);// -90 , -89

		// pre decrement
		byte i4 = 2;
		byte j4 = --i4;
		System.out.println(i4 + " , " + j4);// 1, 1
		byte p4 = -89;
		byte q4 = --p4;
		System.out.println(p4 + " , " + q4);// -90 , -90

		byte s1 = 7;
		System.out.println(s1++); // 7 (first assign 7 then increment by 1)
		System.out.println(s1); // 8

		byte s2 = 9;
		System.out.println(++s2); // 8 (first increment 7 by 1 then assign)
		System.out.println(s2++);
		
		
	}

}
