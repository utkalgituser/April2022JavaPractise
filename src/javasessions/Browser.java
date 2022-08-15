package javasessions;

public class Browser {

	// WAF: launch browser on the basis of given browser
	// func name: launchBrowser()
	// input param: browserName(String)
	// retun: boolean(true/false)

	public boolean launchBroweser(String browserName) {
		boolean flag = false;
		switch (browserName) {
		case "chrome":
			System.out.println("Chrome launched");
			flag = true;
			break;
		case "firefox":
			System.out.println("firefox launched");
			flag = true;
			break;
		case "edge":
			System.out.println("edge launched");
			flag = true;
			break;
		default:
			System.out.println("Please pass correct broowser " + browserName);
			break;
		}
		return flag;
	}

	public static void main(String[] args) {
		Browser br=new Browser();
		//boolean flag= br.launchBroweser("opera");
		boolean flag= br.launchBroweser("chrome");
		System.out.println(flag);
		if(flag) {
			System.out.println("https://google.com");
		}
	}

}
