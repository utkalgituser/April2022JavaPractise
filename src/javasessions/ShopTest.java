package javasessions;

public class ShopTest {

	public static void main(String[] args) {
		AmazonShop app=new AmazonShop();
		// As the every method returns current class object then we can use the
		// reference object for method chaining
		// This is called builder pattern.
		app.login("utkal@gmail.com", "abc@123")
				.search("iphone", "black")
					.addToCart("iphone")
						.doPayment("utkal@icici")
							.generateOrderId()
								.logout();
		
		app.login("utkal@gmail.com", "abc@123")
		.search("iphone", "black")
			.addToCart("iphone")
				.doPayment("457567562343",543)
					.generateOrderId()
						.logout();
		
		app.login("utkal@gmail.com", "abc@123")
		.search("iphone", "black")
			.addToCart("iphone")
				.logout();
	}

}
