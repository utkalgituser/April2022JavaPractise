package superkeyword;

public class TestCar {

	public static void main(String[] args) {
		Audi a = new Audi();
		System.out.println(a.speed); // 200
		a.getSpeed();
		a.start();
		Audi a1 = new Audi(60);
		a.start();
	}

}
