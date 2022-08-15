package constructorconcepts;

public class Company {
	String name;
	int empCount;
	String hq;
	String ceo;
	double sharePrice;
	
	public Company(String name) {
		this.name = name;
	}

	public Company(String name, int empCount, String hq, String ceo, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.hq = hq;
		this.ceo = ceo;
		this.sharePrice = sharePrice;
	}

	public Company(String name, String hq) {
		this.name = name;
		this.hq = hq;
	}

	public Company(String name, int empCount, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.sharePrice = sharePrice;
	}
	
	
}
