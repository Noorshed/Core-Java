package day1and3rd.polymorphism;

public class Product {
	
	int productId;
	String productName;
	double price;
	int quantity;
	
	// Getter method for all variables
		public int getProductId()
		{
			return this.productId;
		}
		
		public String getProductName()
		{
			return this.productName;
		}
		
		public double getPrice()
		{
			return this.price;
		}
		
		public int getQuantity()
		{
			return this.quantity;
		}

		// Setter method for all variables
		public void setProductId(int productId)
		{
			this.productId = productId;
		}
		
		public void setProductName(String productName)
		{
			this.productName = productName;
		}
		
		public void setPrice(double price)
		{
			this.price = price;
		}
		
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		
		Product(int productId, String productName, double price, int quantity)
		{
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}
		
		public void displayProductDetails()
		{
			System.out.println("Product details :");
			System.out.println("Product Id :" + this.productId);
			System.out.println("Product Name :" + this.productName);
			System.out.println("Price :" + this.price);
			System.out.println("Quantity :" + this.quantity);
		}

}
