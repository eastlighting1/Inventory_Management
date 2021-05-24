import java.util.Scanner;
import java.util.ArrayList;

public class Main_Menu {

	// Main menu, show at first
	static void menu() {
		System.out.println("1- Add New Product ");
		System.out.println("2- Display All Product ");
		System.out.println("3- Add Category ");
		System.out.println("4- Display All Category ");
		System.out.println("5- Add Warehouse ");
		System.out.println("6- Display All Warehouse ");
		System.out.println("0- End Program ");
	}

	// Function for select menu
	public static void main(String[] args) {
		int select;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Client> clientList = new ArrayList<Client>();
		ArrayList<Category> categoryList = new ArrayList<Category>();

		do {
			Product p = new Product();
			Category k = new Category();
			menu();
			select = keyboard.nextInt();

			switch(select) {
			case 1:
				System.out.println("Enter Product No: ");
				p.setNo(keyboard.nextInt());
				System.out.println("Enter Product Name: ");
				keyboard = new Scanner(System.in);
				keyboard.next();
				p.setName(keyboard.nextLine());
				System.out.println("Enter Product Price: ");
				p.setPrice(keyboard.nextInt());
				p.addProduct(p);
				productList.add(p);
				break;

			case 2:
				p.displayProduct(productList);
				break;

			case 3:
				System.out.println("Enter Large Category: ");
				k.setCategory_name(keyboard.nextLine());
				System.out.println("Enter Sub Category: ");
				k.setSub_category_name(keyboard.nextLine());
				k.addCategory(k);
				categoryList.add(k);
				break;
				
			case 4:
				k.displayCategory(categoryList);
				break;
				
			case 5:

				break;
			case 6:

				break;

			default:
				break;
			}
		} while (select != 0);
	}
}
