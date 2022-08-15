package oop_abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(); // Child class object
		lp.title();
		lp.logo();
		lp.url();
		lp.header();
		lp.loadingPage();
		Page.footer();
		LoginPage.footer();
		lp.doLogin("admin", "admin");
		System.out.println("-------------");
		
		// top casting: child class object can be referred by parent class ref variable
		
		Page p=new LoginPage();
		p.title();
		p.url();
		p.loadingPage();
		Page.footer();
		p.loadingPage();
		
		
	}
}
