package stringmanipulation;

public class StringBufferStringBuilder {

	public static void main(String[] args) {

		// String: immutable

		// mutable --> not synchronized
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);
		System.out.println("capacity is "+sb.capacity());
		sb.append("automation");
		System.out.println(sb);
		System.out.println("capacity is "+sb.capacity());

		// mutable --> synchronized
		StringBuffer sf = new StringBuffer("hello");
		System.out.println(sf);
		System.out.println("capacity is "+sf.capacity());
		sf.append("hi");
		System.out.println(sf);
		System.out.println("capacity is "+sf.capacity());
	}

}
