package browservendors;

import browser.BrowserUtil;

public class Chrome extends BrowserUtil {

	@Override
	public void click() {
		System.out.println("Chrome clicking...");
	}

	public void get(String url) {
		System.out.println("get ..." + url);
	}
}
