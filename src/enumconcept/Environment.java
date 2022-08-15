package enumconcept;

public enum Environment {
	
	QA("qa"),
	DEV("dev"),
	STAGE("stage"),
	UAT("uat"),
	PROD("prod"),
	PI(3);
	
	private String envName;
	private int intVal;

	Environment(String env) {
		this.envName = env;
	}
	
	Environment(int i) {
		this.intVal=i;
	}

	public String getEnvValue(){
		return this.envName;
	}
	
	public int getIntValue(){
		return this.intVal;
	}
}
