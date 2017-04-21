	// Java Bikes
	package view;

	import java.util.Scanner;

	import model.CreditCard;
	import model.RegisterCustomer;
	
	public class CustomerView {

	private Scanner input;


	public CustomerView(){
			
		}
		  
			
	public  RegisterCustomer getRegisterCustomerDetails(){
			input = new Scanner(System.in);
			String details;
			RegisterCustomer RC = new RegisterCustomer();
			CreditCard CC = new CreditCard();
			LoginView LV = new LoginView();

			
			boolean correct = false;
			while (!correct) {
			System.out.print("Enter your first name: ");
			details = input.nextLine();
			RC.setFirstName(details);
			correct = true;
			}
			
			
			correct = false;
			while (!correct) {
			System.out.print("Enter your surname: ");
			details = input.nextLine();
			RC.setSirname(details);			
			correct = true;
			}

			
			correct = false;
			while (!correct) {
			System.out.println("Enter your Phone Number (8 digits):");
			details = input.nextLine();
			if (details.matches("[0-9]+") && details.length()==8) {
			    RC.setPhoneNumber(details);
			correct = true;
			}
			else
			System.out.println("Invalid number");
			}
			
			
			correct = false;
			while (!correct) {
			System.out.print("Enter your card number(16 digits: xxxx xxxx xxxx xxxx): ");
			details = input.nextLine();
			if (details.matches("^(\\d{4} ?\\d{4} ?\\d{4} ?\\d{4})")) {
			    CC.setCardNumber(details);
			correct = true;
			}
			else 
			System.out.println("you have entered wrong credit card number");
			}

			
			correct = false;
			while (!correct) {
			System.out.print("Enter your expiry month and year(4 digits: xx/xx): ");
			details = input.nextLine();
			if (details.matches("^(\\d{2}+/+\\d{2})$")) {
			    CC.setExpiryEnd(details);
			correct = true;
			}
			else 
			System.out.println("you have entered wrong expiry date");
			}

			
			correct = false;
			while (!correct) {
			System.out.print("Enter your cvc(3 digits: xxx): ");
			details = input.nextLine();
			if (details.matches("[0-9]+") && details.length()==3) {
			    CC.setCvc(details);
			correct = true;
			}
			else 
			System.out.println("you have entered wrong cvc");
			}
	
			correct = false;
			while (!correct) {
			System.out.println("Enter your email :");
			details = input.nextLine();
			if (details.matches("[a-zA-Z_0-9]+@+[a-zA-Z_0-9]+.+[a-zA-Z_0-9]")) {
			    RC.setEmail(details);
			correct = true;
			}
			else
			System.out.println("Invalid email");
			}
			
			
			RC.generateUsername();
			RC.writetoFile();
			
			System.out.println(" Dear Customer"); 
			System.out.println(" You have now succesfully created a account in CPH Java Bike Sharing"); 
			System.out.println(" Your Username and Password is displayed below: ");
			System.out.println("Username: " + RC.getUsername() + "and you password" + RC.getPassword());
			
			LV.Reload();
			LV.login();
			return RC;
				
			}

	
			public void printRegisterCustomerDetails(RegisterCustomer RC) {
				// TODO Auto-generated method stub
				System.out.println(RC.toString());
			}


			public void getCustomerViewDetails() {
				// TODO Auto-generated method stub
				
			}
			
			
			
		} // customer class 
