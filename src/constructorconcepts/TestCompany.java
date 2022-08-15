package constructorconcepts;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		Company cpm1 = new Company("Utkal", "bbsr");
		Company cpm2 = new Company("smita", 456, 123.66);
		Company cpm3 = new Company("ibm", 56, "ny", "Myself", 34.56);
		Company cpm4 = new Company("abc ltd");
		System.out.println(cpm1.name + " , " + cpm1.empCount + " , " + cpm1.hq + " , " + cpm1.ceo);
		System.out.println(cpm2.name + " , " + cpm2.empCount + " , " + cpm2.hq + " , " + cpm2.ceo);
		System.out.println(
				cpm3.name + " , " + cpm3.empCount + " , " + cpm3.hq + " , " + cpm3.ceo + " , " + cpm3.sharePrice);
		System.out.println(cpm4.name + " , " + cpm4.empCount + " , " + cpm4.hq + " , " + cpm4.ceo);
		
		Customer c1=new Customer("Utkal", "098787", "utkal@gmail.com");
		ArrayList<String> toOrderList=new ArrayList<>();
		toOrderList.add("Vacum");
		toOrderList.add("touch pen");
		toOrderList.add("fridge");
		Customer c2=new Customer("archana", "sahu", toOrderList);
		System.out.println(c2.firstname+"  , "+c2.lastname);
		System.out.println(c2.orderList);
	}

}
