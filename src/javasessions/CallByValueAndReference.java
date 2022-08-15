package javasessions;

public class CallByValueAndReference {
	
	String name;
	int age;
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public void getInfoMethod(CallByValueAndReference ref) {
		System.out.println(ref.age+" , "+ref.name);
		ref.name="peter";
		ref.age=45;
		
	}
	
	public static void main(String[] args) {
		
		CallByValueAndReference obj=new CallByValueAndReference();
		System.out.println(obj.add(10, 8)); // call by value
		System.out.println(obj.add(10, 10));
		
		obj.age=27;
		obj.name="Sean";
		obj.getInfoMethod(obj); // call by ref
		System.out.println(obj.age+" , "+obj.name);
	}

}
