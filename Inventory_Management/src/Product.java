import java.util.ArrayList;

public class Product {

	private int product_no;
	private String product_name;
	private int unit_price;

	//getter and setter
	public void setNo(int num) {
		this.product_no = num;
	}
	public int getNo() {
		return this.product_no;
	}
	public void setName(String name) {
		this.product_name = name;
	}
	public String getName() {
		return this.product_name;
	}
	public void setPrice(int price) {
		this.unit_price = price;
	}
	public int getPrice() {
		return this.unit_price;
	}

	// Add new product
	public void addProduct(Product p) {
		this.product_name = p.product_name;
		this.product_no = p.product_no;
		this.unit_price = p.unit_price;
	}

	// Display product in data
	public void displayProduct(ArrayList<Product> arr) {
		for (Product product : arr) {
			System.out.println("-------------------------------------------------");
			System.out.println("Product No\t\tProduct Name\t\tUnit Price");
			System.out.println(product.product_no + "\t\t\t" + product.product_name + "\t\t\t\t" + product.unit_price);
			System.out.println("-------------------------------------------------");
		}
	}
}
