	// Java Bikes
	
	package view;

	import java.util.Scanner;

	public class WelcomeView {
			
		public WelcomeView(){
			
			}
			
			public int menuChoice(){
				Scanner input = new Scanner(System.in);
				System.out.println("------------------------------------------");
				System.out.println("   WELCOME TO CPH JAVA BIKES SHARING!   ");
				System.out.println("------------------------------------------");
				System.out.println("");
				System.out.println("What do you want to do? Press the respective number.");
				System.out.println("");
				System.out.println("-----------------------");
				System.out.println("|1| I am a new Customer ");
				System.out.println("|2| I am a existing customer ");
				System.out.println("|3| Admin test - This will show when admin login under [2]");
				System.out.println("|4| login Customer test - This will show when customer login under [2]");
				System.out.println("|5| Quit");
				System.out.println("-----------------------");
				
				int answer = input.nextInt();
			
			   return answer;
			}//method menuChoice	
			
		}//class WelcomeView


