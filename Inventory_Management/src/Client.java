
public class Client {
	
	private int client_id;
	private String client_name;
	private int purchase_qty;
	private int product_no;
	private float total_bill;
	
	// Create client details
	public void AddClient(Client c) {
		
	}
	
	// Display amount bill for clients
	public void DisplayClientBill(Client c) {
		
	}
	
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public int getPurchase_qty() {
		return purchase_qty;
	}
	public void setPurchase_qty(int purchase_qty) {
		this.purchase_qty = purchase_qty;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	
}
