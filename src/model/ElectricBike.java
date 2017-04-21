	// Java Bikes
	package model;

	import model.Product;

	public class ElectricBike extends Product{ 
		private String colour;
		private int hp; // horsepower
		private static int stockAvailable;
		
		
	public ElectricBike(){
	}

		
	public ElectricBike(int productId, String productName, String colour, int hp, double price) {
		super(productId, productName, price);
		this.colour = colour;
		this.hp = hp;
		stockAvailable++; 
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public void rentBike() {
		stockAvailable--;
	}

	
	public static int getStockAvailable() {
		return stockAvailable;
	}
	

	@Override
	public String toString() {
		return "Bike [colour=" + colour + ", hp=" + hp + ", id=" +getProductId() 
		+ ", price=" + getPrice() + ", stock=" + getStockAvailable()+ "]";
	}			
			
}