package javasessions;

public class Customer {

	// Method/function:
	// Can not create a method inside a method
	// void: can not return anything

	// 1. no input and no return:
	public void test() { // 0 input parameter function
		System.out.println("test method......");
	}

	public void printMyNabe() {
		System.out.println("my name is utkal...");
		String name = "Utkal barik";
		System.out.println(name);
	}

	// 2. no input some return
	public int getNumber() {
		System.out.println("get number......");
		int num = 100;
		int num1 = 200;
		int sum = num1 + num;
		return sum;
	}
	
	// 2. some return and some parameter method  
	public int getNumber(int num, int num1) {
		System.out.println("get number......");
		int sum = num1 + num;
		return sum;
	}
	
	public static void main(String[] args) {
		// create the object of class
		Customer obj = new Customer();
		obj.test();
		obj.printMyNabe();
		System.out.println(obj.getNumber());
		System.out.println(obj.getNumber(50,98)); // argument passed here
	}
}
