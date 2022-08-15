package oop_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	public static int min_free=10; 

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
	}
	
	// overloading of overridden method is possible
	public void cardioServices(int a) {
		System.out.println("FH - cardioServices");
	}
	
	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH - pediaServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
	}

	@Override
	public void entServices() {
		System.out.println("FH - entServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH - dentalServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	}

	public void medicalTraining() {
		System.out.println("FH - medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("FH - medicalInsurance");
	}

	public int testing(int a) {
		System.out.println(a);
		return 100;
	}

	// method hiding - as same method available in USMedical
	public static void billingServices() {
		System.out.println("FH - billingServices");
	}

	/*
	 * @Override public void opthaService() {
	 * System.out.println("FH - medicalResearchServ"); }
	 */

	// If you have multiple default methods in multiple interfaces then it can
	// written like this to identify
	@Override
	public void opthaService() {
		UKMedical.super.opthaService();
		System.out.println("FH - medicalResearchServ");
	}

	@Override
	public void neuroServices(int a) {
		System.out.println("FH - neuroServices");
		
	}

	@Override
	public void convid19Vaccination() {
		System.out.println("FH - convid19Vaccination");
	}

}
