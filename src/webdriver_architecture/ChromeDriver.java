package webdriver_architecture;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch google chrome... ");
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
		String title = "Amazon shopping";
		return title;
	}

	@Override
	public void close() {
		System.out.println("Close the browser .... ");
	}

}
