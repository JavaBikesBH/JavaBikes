package view;

import java.util.Scanner;

public class LoginUser {

     public LoginUser(){
		
	 } // LoginUser
	
	public int loginCostumerChoice(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi - What do you want to do?");
		System.out.println("-----------------------");
		System.out.println("|1| Make a booking ");
		System.out.println("|2| View my bookings ");
		System.out.println("|3| Delete a booking");
		System.out.println("|4| View bikes ");
		System.out.println("|5| Quit");
		System.out.println("-----------------------");
		
		int answer = input.nextInt();

	   return answer;
	}// loginCostumerChoice	
	
	
	
}
