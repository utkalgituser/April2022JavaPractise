package exceptionhandling;

public class ThrowKeyWord {

	public static void main(String[] args) {
		
		try {
			throw new Exception("DATANOFOUNDEXCEPTION");			
		} catch (Exception e) {
			System.out.println("data not found exception ");
			e.printStackTrace();
		}
		System.out.println("bye");
	}

}
