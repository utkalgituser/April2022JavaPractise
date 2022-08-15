package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	// WAF: this will return the menu links on the page
	// param: page name
	// return: ArrayList<String>

	public ArrayList<String> getPageMenuLinks(String pageName) {
		System.out.println("page name is : " + pageName);
		ArrayList<String> menuList = new ArrayList<String>();

		if (pageName.trim().equalsIgnoreCase("loginpage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
		} else if (pageName.trim().equalsIgnoreCase("homepage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("cart");
			menuList.add("search");
		} else if (pageName.trim().equalsIgnoreCase("homepage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("info");
			menuList.add("seller");
		} else {
			System.out.println("plz pass right page name: " + pageName);
		}

		return menuList;
	}

	// WAF: to get device list
	// name: getEmptyDeviceList()
	// return list of devices String [] array
	// param: empName
	public String[] getEmptyDeviceList(String empName) {
		System.out.println("Welcome to IT team " + empName);
		// String[] deviceArr = new String[5];
		List<String> list = null;
		String[] deviceArr = null;
		if ((empName.toLowerCase()).equalsIgnoreCase("Sachin")) {
			// Ways to define array list
			// First way
			deviceArr[0] = "samsung";
			deviceArr[1] = "moto";
			deviceArr[2] = "iphone";
			deviceArr[3] = "Realme";
			deviceArr[4] = "OPPO";
			// Second way
			deviceArr = new String[] { "samsung", "moto", "iphone", "Realme", "OPPO" };
			// third way
			deviceArr = "samsung,moto,iphone,Realme,OPPO".split(","); // split will array of string
			// fourth way 
			list = Arrays.asList("samsung", "moto", "iphone", "Realme", "OPPO");
			deviceArr = list.toArray(new String[list.size()]);

		} else if ((empName.toLowerCase()).equalsIgnoreCase("Ravi")) {
			deviceArr[0] = "lenovo";
			deviceArr[1] = "Realme";
			deviceArr[2] = "OPPO";
		} else if ((empName.toLowerCase()).equalsIgnoreCase("Rachna")) {
			deviceArr[0] = "hp";
			deviceArr[1] = "Win";
			deviceArr[2] = "OPPO";
		} else if ((empName.toLowerCase()).equalsIgnoreCase("Sangeeta")) {
			deviceArr[0] = "samsung";
			deviceArr[1] = "key board";
			deviceArr[2] = "iphone";
			deviceArr[3] = "Mouse";
			deviceArr[4] = "OPPO";
		} else {
			System.out.println("Employee name not found " + empName);
		}
		return deviceArr;
	}

	public static void main(String[] args) {
		Application app = new Application();
		ArrayList<String> categoryList = app.getPageMenuLinks(" LOGINpage ");
		System.out.println(categoryList.toString());

		// will return empty array list []
		categoryList = app.getPageMenuLinks(" cartpage ");
		System.out.println(categoryList.toString());
		String[] device = app.getEmptyDeviceList("Rachna");
		System.out.println(Arrays.toString(device));
		device = app.getEmptyDeviceList("Utkal");
		System.out.println(Arrays.toString(device));
	}

}
