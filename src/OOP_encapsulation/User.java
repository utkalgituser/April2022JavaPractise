package OOP_encapsulation;

public class User {

	private String name;
	private int sharePrice;
	private boolean isActive;
	
	// create a user, get the user but update is not allowed (then setter is not allowed, but constructor and getter allowed)
	// create a user, get the user but update is allowed (then constructor and getter allowed, setter is allowed)
	
	public User(String name, int sharePrice, boolean isActive) {
		this.name = name;
		this.sharePrice = sharePrice;
		this.isActive = isActive;
	}
	
	// public getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
