package Poo;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_product {

	public static void main(String[] args) {
		
	   Locale.setDefault(Locale.US);	
	   Scanner scn = new Scanner (System.in);
	   
	  
	   System.out.println("Enter product data: ");
	   
	   System.out.print("Name: ");
	   String name = scn.nextLine();
	   
	   System.out.print("Price: ");
	   double price = scn.nextDouble();
	   
	   
	   Product product = new Product(name, price);
	   
	   product.setName ("Computer");
	   System.out.println("Update data: " + product.getName());
	   
	   
	   product.setPrice(1200.00);
	   System.out.println("Update price: " + product.getPrice());
	   
	   
	   
	   System.out.println();
	   System.out.println("Product data: " + product);
	   
	  
	   System.out.println();
	   System.out.println("Enter the number of products to be added in stock: ");
	   int quantity = scn.nextInt();
	   product.addProducts(quantity);

	   System.out.println();
	   System.out.println("Update data: " + product);
	   
	   System.out.println();
	   System.out.println("Enter the number of products to be removed from stock: ");
	   quantity = scn.nextInt();
	   product.removeProducts(quantity);
	   
	   System.out.println();
	   System.out.println("Update data: " + product);
	}
}
