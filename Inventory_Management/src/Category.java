import java.util.ArrayList;

public class Category {

	private String category_name;
	private String sub_category_name;

	//getter and setter
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getSub_category_name() {
		return sub_category_name;
	}
	public void setSub_category_name(String sub_category_name) {
		this.sub_category_name = sub_category_name;
	}

	//create category list
	public void addCategory(Category k) {
		this.category_name = k.category_name;
		this.sub_category_name = k.sub_category_name;
	}

	//show category list
	public void displayCategory(ArrayList<Category> arr) {
		for (Category category : arr) {
			System.out.println("==================================================================");
			System.out.println("Large Category\t\t\tSub Category");
			System.out.println(category.category_name + "\t\t\t" + category.sub_category_name);
			System.out.println("==================================================================");
		}
	}
}
