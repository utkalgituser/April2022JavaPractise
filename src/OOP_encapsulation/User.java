package OOP_encapsulation;

public class User {

	private String name;
	private int sharePrice;
	private boolean isActive;

	public User(String name, int sharePrice, boolean isActive) {
		this.name=name;
		this.sharePrice=sharePrice;
		this.isActive=isActive;
	}

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
