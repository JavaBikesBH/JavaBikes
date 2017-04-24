package control;

import view.LoginUser;
// hi bilal
public class LoginUsercontrol {
	 private LoginUser myLoginUser = new LoginUser(); // used to show login user menu
		
	   public void loginUserController(){
		   
		   boolean Luser = true;
			while (Luser)  {
		        int choise = myLoginUser.loginCostumerChoice();
		        System.out.println(choise); // has to be delete
		        switch (choise){
				  case 1: System.out.println("A Booking has been made");
				  break;
				  case 2: System.out.println("Here is your booking");
				  break;
				  case 3: System.out.println("Your booking has been deleted");
				  break;
				  case 4: System.out.println("Look all bikes");
			      break;
				  case 5: Luser = false;
				  break;
				  default : System.out.println("You have put an invalid choice");

				}//switch
		        
			} // While
		} // AdminController
}
