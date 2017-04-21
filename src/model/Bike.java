	// Java Bikes
	package model;

	import model.Product;

	public class Bike extends Product{ 
		private String colour;
		private int gear;
		private static int stockAvailable;
		
		
	public Bike(){
	}

		
	public Bike(int productId, String productName, String colour, int gear, double price) {
		super(productId, productName, price);
		this.colour = colour;
		this.gear = gear;
		stockAvailable++; 
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	public void rentBike() {
		stockAvailable--;
	}

	
	public static int getStockAvailable() {
		return stockAvailable;
	}
	

	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", gear=" + gear + ", id=" +getProductId() 
		+ ", price=" + getPrice() + ", stock=" + getStockAvailable()+ "]";
	}			
			
}