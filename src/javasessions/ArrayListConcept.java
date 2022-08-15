package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList : default class in java 
		// collection : dynamic array
		
		// create object of ArrayList
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		System.out.println(ar.size());
		ar.add(100); //0
		ar.add(200); // 1
		System.out.println(ar.size());
		
		ar.add(900); // 1
		ar.add(704); // 1
		System.out.println(ar.size());
		ar.add(905); // 1
		ar.add(908); // 1
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		// java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
		// System.out.println(ar.get(6)); 
		
		ArrayList<Object> ar1=new ArrayList<Object>(5);
		// vc=5 (virtual capacity), pc=0(physical capacity)
		ar1.add(900);
		ar1.add(910);
		ar1.add(990);
		ar1.add(905);
		ar1.add(900);
		ar1.add("dfdf");
		ar1.add(900);
		// vc=0 (virtual capacity), pc=5(physical capacity)
		System.out.println(ar1);
		ar1.add(901);
		System.out.println(ar1);
		ar1.remove(5);
		System.out.println(ar1);
		Collections.swap(ar1, 1, 2);
		System.out.println(ar1);
		// To reverse an array list
		Collections.reverse(ar1);
		System.out.println(ar1);
	}

}
