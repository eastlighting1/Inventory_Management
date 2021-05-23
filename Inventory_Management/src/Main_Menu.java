import java.util.Scanner;
import java.util.ArrayList;

public class Main_Menu {
	
	// Main menu, show at first
	static void menu() {
		System.out.println("1- Add New Product ");
		System.out.println("2- Display All Product ");
		System.out.println("3- Modifiy Category ");
		System.out.println("0- End Program ");
	}
	
	// Function for select menu
	public static void main(String[] args) {
		int select;
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		
		do {
			Product p = new Product();
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
				
				break;
				
			default:
					break;
			}
		} while (select != 0);
	}
}
