package javasessions;

public class MainMethodOverLoading {

	public  void main() {
		System.out.println("main 1 method");
	}
	
	public  void main(String a) {
		System.out.println("main 2 method "+a);
	}
	
	// we can change parameter name
	// JVM is calling the main method and not passing any value
	// If we do t[0], we will get AIOB -array index out of bound
	public static void main(String []t) {
		System.out.println(t.length);
		System.out.println("this is my java code");
		MainMethodOverLoading obj=new MainMethodOverLoading();
		obj.main("testing");
	}
	
	public  void main(int[] args) {
		System.out.println("java code");
	}
	
}
