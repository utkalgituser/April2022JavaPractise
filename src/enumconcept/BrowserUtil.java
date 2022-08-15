package enumconcept;

public class BrowserUtil {

	public static void main(String[] args) {

		Browser browser=Browser.CHROME;
		if(browser ==Browser.CHROME) {
			System.out.println("Launch browser chrome");
		}
		
		Environment env=Environment.QA;
		System.out.println(env.getEnvValue());
		
		Environment env1=Environment.PROD;
		System.out.println(env1.getEnvValue());
		
		Environment intergerVal=Environment.PI;
		System.out.println(intergerVal.getIntValue());
		
		System.out.println(Constant.LOGIN_PAGE_TITLE);
		System.out.println(AppConstant.DEFAULT_TIME_OUT);
	}

}
