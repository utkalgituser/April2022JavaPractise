package oop_abstract;

public abstract class Page {
	
	// 0 to 100% abstraction 
	// only non abstract method -> 0% abstraction 
	// only abstract method -> 100% abstraction
	// non abstract and abstract method -> partial abstraction
	// can't create object
	// Constructors are allowed an it will be called when you create the object of child class
	
	
	public Page() {
		System.out.println("Page - cobstructor");
	}
	
	public abstract void title();

	public abstract void url();

	public abstract void header();

	public void loadingPage() {
		System.out.println("page - loading...");
	}

	public final void logo() {
		System.out.println("page - logo");
	}
	
	public static void footer() {
		System.out.println("page - footers");
	}
	
	private void loadHTML() {
		System.out.println("page - HTML");
	}
}
