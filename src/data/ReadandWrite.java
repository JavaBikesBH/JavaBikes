package data;

	import java.util.ArrayList;
	import java.util.Scanner;

	import model.Bike;
	import model.ElectricBike;
	import model.RegisterCustomer;
	import model.Product;

	import java.io.*;

public class ReadandWrite {
	
		public static Scanner readDetails( String file){
		Scanner input = new Scanner(System.in);
		
		try {
		File ReadFile = new java.io.File(file);
		
		input = new Scanner(ReadFile);
		
	    // Close the file
	   
		}
	    catch (FileNotFoundException ex){
	    	System.out.println("Error reading the file'" + file + "'");
	    }
		return input;
	}//readDetails

	public static RegisterCustomer getRegisterCustomer(String line){
		RegisterCustomer customerFromFile = new RegisterCustomer();
		// Look for every ";" and turns the values into strings
			    String[] values = line.split(";");
			   	    	   
			// Change the String type into the correct format
				customerFromFile.setSirname(values[0]);
				customerFromFile.setFirstName(values[1]);
				customerFromFile.setUsername(values[2]);
				customerFromFile.setPassword(values[3]);
				customerFromFile.setPhoneNumber(values[4]);
				customerFromFile.setEmail(values[5]);
				
	     return customerFromFile;

	}
	
	
	public static Product getProduct(String line){
		
		String[] values = line.split(";"); 
		if (values[1].equals("Bike")){
			int productID = Integer.parseInt(values[0]);
			int gear = Integer.parseInt(values[3]);
			double price = Double.parseDouble(values[4]);
			Bike BikeFromFile = new Bike(productID,values[1],values[2],gear,price);
			
			return 	BikeFromFile;
			
		}
		
		
		// need to get this explained
		else {
			ElectricBike ElectricBikeFromFile = new ElectricBike(Integer.parseInt(values[0]),values[1],values[2],
					Integer.parseInt(values[3]),Double.parseDouble(values[4]));
		
		return ElectricBikeFromFile; }
	
		}
	

		public static ArrayList<RegisterCustomer> getAllRegisterCustomerDetails(){
		ArrayList<RegisterCustomer> customerList = new ArrayList<RegisterCustomer>();
		Scanner input = readDetails("customer.txt");
		

		// checking each line 
		while (input.hasNextLine()) {
			customerList.add(getRegisterCustomer(input.nextLine()));
			//passing each line to the method getCustomer which returns a customer
			} 								//then added to a ArrayList
		
		return customerList;
		}

		public static ArrayList<Product> getAllProductDetails(){
		ArrayList<Product> productList = new ArrayList<Product>();
		Scanner input = readDetails("product.txt");

		// checking each line 
		while (input.hasNextLine()) {
			
			productList.add(getProduct(input.nextLine()));//passing each line to the method getProduct which returns a product
				} 								//then added to a ArrayList
		
		return productList;
		}


		public static void WriteDetails(String file, String input){
		try{
		FileWriter fwriter = new FileWriter(file,true);
		PrintWriter output = new java.io.PrintWriter(fwriter);
		 // Write formatted output to the file
	    output.println(input);
	    output.close();
		}
		catch (IOException ex) {
			// if the file is not accessible, print this message
			System.out.println("Error writing to file '" + file + "'");
		}
		}//WriteDetails	


		}