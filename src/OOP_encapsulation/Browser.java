package OOP_encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launch browser");
		checkChromeService();
		checkOSCompatible();
		checkRAMSize();
		checkChromeVersion();
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkRAMSize() {
		System.out.println("checkOSCompatible");
	}

	private void checkChromeVersion() {
		System.out.println("checkOSCompatible");
	}

	private void checkChromeService() {
		System.out.println("checkOSCompatible");
	}
}
