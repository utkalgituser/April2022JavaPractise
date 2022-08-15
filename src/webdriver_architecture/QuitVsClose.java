package webdriver_architecture;

import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium JARS\\Browser Executables\\geckodriver.exe");
		org.openqa.selenium.WebDriver dr=new FirefoxDriver();
		dr.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(dr.getCurrentUrl());
		// session ID set to null
		dr.quit(); 
		dr=new FirefoxDriver();
		dr.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(dr.getTitle());
		dr.close(); 
		dr.quit(); 
		
	}

}
