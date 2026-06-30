package oop_abstract;

public abstract class Page {

	static int price = 30;
	String name;
	private int DOJ = 30122011;

	// 0 to 100% abstraction
	// only non abstract method -> 0% abstraction
	// only abstract method -> 100% abstraction
	// non abstract and abstract method -> partial abstraction
	// can't create object
	// Constructors are allowed and it will be called when you create the object of
	// child class

	protected Page() {
		System.out.println("Page - constructor.....");
	}

	protected Page(int DOJ) {
		this.DOJ = DOJ;
	}

	
	public int getDOJ() {
		return DOJ;
	}

	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}

	public abstract void title();

	public abstract void url();

	public abstract void header();

	public void loadingPage() {
		System.out.println("page - loading... in 20 secs");
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

	public void load() {
		loadHTML();
	}
}
