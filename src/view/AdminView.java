package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.RegisterCustomer;
import data.ReadandWrite;

public class AdminView {
	private ArrayList<RegisterCustomer>customerDetails;
	
	public AdminView(){
		
	}
	
	public int AdminChoice(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi Admin  - What do you want to do?");
		System.out.println("-----------------------");
		System.out.println("|1| View customer list ");
		System.out.println("|2| delete a customer ");
		System.out.println("|3| View bikes");
		System.out.println("|4| add a bike ");
		System.out.println("|5| View bookings ");
		System.out.println("|6| Quit");
		System.out.println("-----------------------");
		
		int answer = input.nextInt();

	   return answer;
	}// AdminChoice	
	
	public void AdminCustomerView(){
		customerDetails = ReadandWrite.getAllRegisterCustomerDetails();
		for(int i = 0; i < customerDetails.size(); i++){
			System.out.println(customerDetails.get(i));
			
			} // for
					
	} // AdminCustomerView
	
    public void AdminCustomerdelete(){
		
	} // AdminCustomerdelete

    public void AdminBikeView(){
	
    } // AdminbikeView
	
    public void AdminAddBikeView(){
	
    } // AdminAddBikeView
 	
    public void AdminBookingView(){
	
    } // AdminBookingView

}//class AdminView
