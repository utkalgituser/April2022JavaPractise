package browservendors;

import browser.BrowserUtil;

public class Firefox extends BrowserUtil{
	
	@Override
	public void click() {
		System.out.println("Firefox clicking...");
	}
	
	public void get(String url) {
		System.out.println("get ..." + url);
	}
}
