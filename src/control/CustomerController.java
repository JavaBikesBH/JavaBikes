package control;

//Ahmad her fuck jer alle !
import model.RegisterCustomer;

import view.CustomerView;
import view.WelcomeView;
	
	public class CustomerController {

		   private RegisterCustomer myCustomer = new RegisterCustomer();
		   private WelcomeView welcome = new WelcomeView();
		   private CustomerView myView = new CustomerView();
		   
			
		   public CustomerController(RegisterCustomer myCustomer, CustomerView myView){
				this.myCustomer = myCustomer;
				this.myView = myView;
			}
			
			public void createCustomer(){
				myCustomer = myView.getRegisterCustomerDetails();
			}
			
			public void print(){
				myView.printRegisterCustomerDetails(myCustomer);
			}
			
			
				
		}
