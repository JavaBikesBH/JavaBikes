	// Java Bikes
	package model;

	public class Product {

		private String productName;
		private static int id;
		private int productId;
		private double price;

		
		public Product(int productId, String productName,double price){
			this.productName = productName;
			this.price = price;
			id++;
			productId = id;
			}
		
		
		public int getProductId() {
			return productId;
			}

		
		public void setProductId(int productId) {
			this.productId = productId;
			}

		
		public Product(){
			id++;
			}
		

		public String getProductName() {
			return productName;
			}

		
		public void setName(String productName) {
			this.productName = productName;
			}

		
		public int getId() {
			return id;
			}

		
		public void setId(int id) {
			this.id = id;
			}

		
		public double getPrice() {
			return price;
			}

		public void setPrice(double price) {
			this.price = price;
			}
	}