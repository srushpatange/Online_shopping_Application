package com.tnsif.onlineshopping.application;

import java.util.Scanner;

public class OnlineShopping {
	
	private static ProductService productService = new  ProductService();
	private static CustomerService customerService = new CustomerService();
	private static OrderService orderService = new  OrderService();
	private static AdminService adminService = new  AdminService();
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {

		          System.out.println("1. Admin Menu");

		          System.out.println("2. Customer Menu");

		          System.out.println("3. Exit");

		          System.out.print("Choose an option: ");

		          int choice = scanner.nextInt();

		          switch (choice) {
             
		          case 1: //Admin Module

		               int adminChoice;

		               do {

		                  System.out.println("\nAdmin Menu:");

		                  System.out.println("1. Add Product");

		                  System.out.println("2. Remove Product");

		                  System.out.println("3. View Products");

                   		  System.out.println("4. Create Admin");

		                  System.out.println("5. View Admins");

		                  System.out.println("6. Update Order Status");

		                  System.out.println("7. View Orders");

		                  System.out.println("8. Return");

		                  System.out.print("Choose an option: ");

		                  adminChoice = scanner.nextInt();
		
		                  switch (adminChoice) (

		                  case 1:

		                  addProduct (scanner);

		                  break;

		                  case 2 :

		                  removeProduct (scanner);

		                  break;

		                  case 3:

		                  viewProducts();

		                  break;

		                  case 4:

		                  createAdmin(scanner);

		                  break;

		                  case 5:

		                  viewAdmins();

		                  break;

		                  case 6:

		                  updateOrderStatus(scanner);

		                  break;

		                  case 7:

                   		  viewOrders();

		                  break;

		                  case 8:

		                  System.out.println("Exiting Admin...");

		                  break;

		                  default:

		                  System.out.println("Invalid choice! Please try again.");

		                }

		             } while (adminChoice != 8);
		
	case 2: //Customer Module

		int customerChoice;

		do {

		System.out.println("\nCustomer Menu:");

		System.out.println("1. Create Customer");

		System.out.println("2. View Customers");

		System.out.println("3. Place Order");

		System.out.println("4. View Orders");

		System.out.println("5. View Products");

		System.out.println("6. Return");

		System.out.print("Choose an option: ");

		customerChoice = scanner.nextInt();

		switch (customerChoice) {

		case 1:

		     createCustomer(scanner);

		     break;

		case 2:

		     viewCustomers();

		     break;

		case 3:

		     placeOrder(scanner);

		     break;

		case 4:

		viewOrders(scanner);

		     break;

		     case 5:

		viewProducts();

		     break;

		     case 6:

		     System.out.println("Exiting Customer Menu...");

		     break;

		  default:

		     System.out.println("Invalid choice! Please try again.");

		  }

		} while (customerChoice != 6);

		break;
		
	        }     while (customerChoice != 6);

		          break;

		case 3:

		        System.out.println("Exiting...");

		        scanner.close();

		        return;

		default:

		        System.out.println("Invalid choice! Please try again.");
		 
        

	
     

}

		private static void addProduct (Scanner scanner) {

		System.out.print("Enter Product ID: ");

		int productId = scanner.nextInt();

		System.out.print("Enter Product Name: ");

		String name = scanner.next();

		System.out.print("Enter Product Price: ");

		double price = scanner.nextDouble();

		System.out.print("Enter Stock Quantity: ");

		int stockQuantity=scanner.nextInt();

		Product product = new Product (productId, name, price, stockQuantity);

		productService.addProduct (product);

		System.out.println("Product added successfully!");

		}

		private static void removeProduct (Scanner scanner) {
			
		System.out.print("Enter Product ID: ");

		int productId = scanner.nextInt();

		productService.removeProduct (productId);

		System.out.println("Product removed successfully!");
		
		
		
	}


