package oop_interface;

public interface UKMedical extends WHO{
	
	public void entServices();
	public void dentalServices();
	public void emergencyServices();
		
	default  void opthaService(){
		System.out.println("US - medicalResearchServ");
	}
}
