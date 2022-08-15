package browservendors;

import browser.BrowserUtil;

public class TestBrowser {

	public static void main(String[] args) {

		Chrome c = new Chrome();
		c.click();
		c.closeBrowser();
		c.sendKeys("name");

		BrowserUtil br = null;

		String browserName = "chrome";
		if (browserName.equals("chrome")) {
			br = new Chrome();
		} else if (browserName.equals("firefox")) {
			br = new Firefox();
		} else {
			System.out.println("pass correct browser name and going for default");
			br = new Chrome();
		}
		// IN top casting we can't access individual methods of child class
		br.click();
	}

}
