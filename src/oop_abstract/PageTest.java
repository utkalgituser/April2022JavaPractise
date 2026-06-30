package oop_abstract;

public class PageTest {

	public static void main(String[] args) {

		// Abstract class Object can't be created
		LoginPage lp = new LoginPage(); // Child class object
		lp.title();
		lp.logo();
		lp.url();
		lp.header();
		lp.loadingPage();
		Page.footer();
		LoginPage.footer();
		lp.doLogin("admin", "admin");
		System.out.println(LoginPage.price);
		lp.name = "IBM";
		System.out.println(lp.name);
		System.out.println("-------------");

		// top casting: child class object can be referred by parent class ref variable

		Page p = new LoginPage();
		p.title();
		p.url();
		p.loadingPage();
		Page.footer();
		p.load();
		System.out.println(Page.price);
		System.out.println("DOJ is " + p.getDOJ());
		p.setDOJ(25122026);
		System.out.println("DOJ is " + p.getDOJ());
		System.out.println("-------------");

		LoginPage lp1 = new LoginPage(26112020);
		System.out.println("DOJ is " + lp1.getDOJ());
		System.out.println("DOJ is " + p.getDOJ());
	}
}
