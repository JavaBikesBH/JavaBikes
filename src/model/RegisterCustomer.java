	// Java Bikes
	package model;

	import data.ReadandWrite;

	public class RegisterCustomer {
	
	private String firstName, sirname, phoneNumber, email, username, password;

	public RegisterCustomer(){
		
	}

	
	public RegisterCustomer(String fname, String sname, String phnu, String crca, String ema){
	   firstName = fname;
	   sirname = sname;
	   phoneNumber = phnu;
	   email = ema;

	   
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getSirname() {
		return sirname;
	}

	public void setSirname(String sirname) {
		this.sirname = sirname;
	}


	public String getPhonenumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void generateUsername() {
		this.username = firstName.substring(0, 3)+sirname.substring(0, 3);
		this.password = sirname.substring(0, 3) + phoneNumber.substring(2, 5);
		//System.out.println("Username is; " + username + "& Password is; " + password); 
	}
	
	
	public String toString(){
		return (firstName+ " " + sirname + " " + phoneNumber +" " + " "+ email);
	}

		//den her kode der ikke sender det videre til vores tekst file
	public void writetoFile(){
		String details = sirname+ ";" + firstName + ";" + getUsername() + ";" + getPassword() + ";" + phoneNumber +";"+ email+ ";";
		ReadandWrite.WriteDetails("customer.txt", details);
		 
	}
	
}
