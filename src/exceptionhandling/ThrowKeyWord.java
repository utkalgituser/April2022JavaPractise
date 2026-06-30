package exceptionhandling;

public class ThrowKeyWord {

	public static void main(String[] args) {

		getInfo();
	}

	public static void getInfo() {
		String data = null;
		try {
			if (data == null) {
				throw new Exception("DATANOFOUNDEXCEPTION");
			}
		} catch (Exception e) {
			System.out.println("Data not found exception... ");
			e.printStackTrace();
		}
		System.out.println("bye");
	}
}
