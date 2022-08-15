package oop_interface;

public interface USMedical extends WHO{
	
	// interface variables are static & final by default
	public int min_free=20; 
	
	// can not have any method body
	//no method body --> abstract method
	// only method prototype - only method declaration
	// can't have business logic 
	
	// class to class extends key word
	// class to interface implements key word
	// interface to interface extends key word
	
	// Method overloading of abstract classes 
	public void neuroServices();
	public void neuroServices(int a);
	public void cardioServices();
	public void physioServices();
	public void emergencyServices();
	
	// after jdk1.8: two major changes
	//1. can have static methods with method body
	
	public static void billingServices() {
		System.out.println("US - billingServices");
	}
	
	//2. can have default method with method body
	// we can override the default method on child class
	default  void opthaService(){
		System.out.println("US - medicalResearchServ");
	}
}
