package webdriver_architecture;

public class AmazonTest {

	static WebDriver driver = null;

	public static void main(String[] args) {

		// chrome:
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		driver.get("https://amazon.com");

		driver.click("Sign in");
		driver.sendKeys("emaiid", "abc@gmmail.com");
		driver.sendKeys("pwd", "abc@123");
		driver.click("login");
		String title = driver.getTitle();
		System.out.println("title is " + title);

		// check point/ verification point
		if (title.equals("Amazon shopping")) {
			System.out.println("correct title");
		} else {
			System.out.println("in correct title");
		}
		driver.close();
	}

}
