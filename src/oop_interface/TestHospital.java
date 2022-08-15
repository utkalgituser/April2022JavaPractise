package oop_interface;

public class TestHospital {
	
	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalResearch();
		fh.opthaService();
		
		System.out.println("--------------");
		
		// top casting: child class object can be referred by parent interface ref variable
		USMedical us=new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.physioServices();
		us.neuroServices();
		USMedical.billingServices();
		System.out.println("Fee is "+FortisHospital.min_free);
		System.out.println("Fee is "+USMedical.min_free);
		
		System.out.println("--------------");
		UKMedical uk=new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		System.out.println("--------------");
		
		// 3 interfaces country wise (fed, rbi, uk) and 2 banks(icici, hdfc), 1 common class extends
	}
}	
