package javasessions;

import java.util.Arrays;

public class SaticArrayLiterals {
	String[] menuList;
	
	public static void main(String[] args) {
		SaticArrayLiterals sal=new SaticArrayLiterals();
		String[] arr=sal.getPageMenuLinks("loginpage");
		System.out.println(Arrays.toString(arr));
		sal=new SaticArrayLiterals();
		Arrays.toString(sal.getPageMenuLinks("cartpage"));
	}

	public String[] getPageMenuLinks(String pageName) {
		System.out.println("page name is : " + pageName);
		String[] menuList = null;
		
		if (pageName.trim().equalsIgnoreCase("loginpage")) {
			menuList= new String[]{"product","category","price"};
		} else if (pageName.trim().equalsIgnoreCase("homepage")) {
			menuList= new String[]{"product","category","price","cart","search"};
		} else if (pageName.trim().equalsIgnoreCase("homepage")) {
			menuList= new String[]{"product","category","price","info","seller"};
		} else {
			System.out.println("plz pass right page name: " + pageName);
		}
		return menuList;
	}
}
