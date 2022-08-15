package webdriver_architecture;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("launch firefox... ");
	}

	@Override
	public void findElement() {
		System.out.println("find element.... ");
	}

	@Override
	public void findElements() {
		System.out.println("find elements.... ");
	}

	@Override
	public void click(String element) {
		System.out.println("click on element.... " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("send keys to element.... " + element + " value is " + value);
	}

	@Override
	public void get(String url) {
		System.out.println("launch url is .... " + url);

	}

	@Override
	public String getTitle() {
		String title = "xyz";
		return title;
	}

	@Override
	public void close() {
		System.out.println("Close the browser .... ");
	}

}
