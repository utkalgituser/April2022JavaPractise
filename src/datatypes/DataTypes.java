package datatypes;

public class DataTypes {

	public static void main(String[] args) {
		// data types
		// 1. primitive type:
		// a. boolean
		// b. Numeric
		// b.1: Character : char
		// b.2: Integral value:
		// b.2.1: Integer: byte, int, short, long
		// b.2.2: floating point: float double, char, boolean
		// 2. derived type

		// Byte:
		// Size 1 byte = 8 bits
		// Range: -128 to 127
		byte i = 100;
		byte i1 = -120;
		System.out.println(i + " , " + i1);

		// short:
		// Size 2 byte = 16 bits
		// Range: -32768 to 32767
		short s = 1250;
		short s1 = -1260;
		System.out.println(s + " , " + s1);

		// int
		// size: 4 bytes=32 bits
		// range: -2147483648 to 2147483647
		int j = 656823;
		int j1 = 656823;
		System.out.println(j + " , " + j1);

		// long
		// size: 8 bytes=64 bits
		// range:
		// to store a big number we need to suffix "l or, L" at the end of number
		// Use long only for big calculations
		long l = 123244278754685l;
		long l1 = 123244278754483899L;
		System.out.println(l + " , " + l1);

		// float
		// size 4 bytes=32 bits
		// range:

		float f = 12.333f;
		float f1 = 125656.398989F;
		float f2 = (float) 125654.398989;
		System.out.println(f + " , " + f1 + " , " + f2);

		// double
		// size 4 bytes=32 bits
		// range:
		// wring "d" at end is not mandatory

		double d = 12.33d;
		double d1 = 45.3654;
		double d3 = 100;
		System.out.println(d + " , " + d1 + " , " + d3);

		// char
		// size 2 bytes=16 bits
		// range
		char c = 'f';
		char c1 = '$';
		System.out.println(c);
		System.out.println(c + c1);

		// boolean
		// size 1 bit
		boolean flag = true;

	}

}
