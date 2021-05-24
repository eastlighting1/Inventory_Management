
public class ProductInfoTEST {
	
	private int product_code;
	private String product_name;
	private double unit_price;
	private String client;
	private String notes;
	
	//getter and setter method
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	//viewing product information function
	public void showProductInfo() {
		System.out.println("Product Code: " + this.product_code);
		System.out.println("Product Name: " + this.product_name);
		System.out.println("Price Per Unit: " + this.unit_price);
		System.out.println("Client: " + this.client);
		System.out.println("Notes: " + this.notes);
	}
}
