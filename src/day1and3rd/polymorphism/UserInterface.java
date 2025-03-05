package day1and3rd.polymorphism;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Enter Product Id :");
		int productId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Product Name :");
		String productName = sc.nextLine();
		
		System.out.println("Enter Price :");
		double price = sc.nextDouble();
		
		System.out.println("Enter Quantity :");
		int quantity = sc.nextInt();

		
		Product pr = new Product(productId, productName, price, quantity);
		pr.displayProductDetails();
		
		
				 
	}

}
