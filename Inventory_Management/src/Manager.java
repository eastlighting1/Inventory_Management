import java.sql.*;
import java.util.Scanner;

public class Manager {
    private static PreparedStatement preparedStatement;
    private static Connection con;
    private static ResultSet resultSet;

    private static void addItem(String itemName){
        try{
            String sql = null;
            sql = "create table " + itemName + " (name varchar(20) not null, num int not null);";
            preparedStatement = con.prepareStatement(sql);
            boolean result = preparedStatement.execute();

            if(!result)
                System.out.println("Item Already Exists");
            else
                System.out.println("Add " + itemName + "Successfully!!");

        }catch (Exception e){
            System.out.println("[ERROR] " + e);
        }
    }

    private static void modifyItem(String itemName, int num){
        try{
            String sql = null;
            sql = "create table " + itemName + " (name varchar(20) not null, num int not null);";
            preparedStatement = con.prepareStatement(sql);
            boolean result = preparedStatement.execute();

            if(!result)
                System.out.println("Item Already Exists");
            else
                System.out.println(itemName + " " + num);

        }catch (Exception e){
            System.out.println("[ERROR] " + e);
        }
    }

    private static void deleteItem(String itemName){
        try{
            String sql = null;
            sql = "drop table " + itemName;
            preparedStatement = con.prepareStatement(sql);
            boolean result = preparedStatement.execute();

            if(!result)
                System.out.println("Item Not Exists");
            else
                System.out.println("Remove " + itemName + "Successfully!!");

        }catch (Exception e){
            System.out.println("[ERROR] " + e);
        }

        System.out.println("delete");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "";
        String user_name = ""; //  MySQL 서버 아이디
        String password = ""; // MySQL 서버 비밀번호

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("[ERROR] JDBC Driver Load Error: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(url, user_name, password);
            System.out.println("Connection Success");
        } catch(SQLException e) {
            System.err.println("[ERROR] Connection Error : " + e.getMessage());
            e.printStackTrace();
        }

        // 3.해제
        try {
            if(con != null)
                con.close();
        } catch (SQLException e) {}


        System.out.print("Enter you name : ");
        String name = sc.nextLine();

        System.out.println("HI, " + name);
        System.out.println("This is inventory management system.");

        System.out.println("==================== Menu ====================");
        System.out.println("1. Add Item");
        System.out.println("2. Modify Item's quantity");
        System.out.println("3. Remove Item");
        System.out.println("4. Quit");

        int menuSelect = sc.nextInt();
        sc.nextLine();

        while(menuSelect != 4) {
            if(menuSelect == 1) {
                String item;
                System.out.print("Enter Item's name : ");
                item = sc.nextLine();

                addItem(item);
            }
            else if(menuSelect == 2) {
                System.out.print("Enter Item's name : ");
                String item = sc.nextLine();

                System.out.print("Enter Item's quantity you want to modify: ");
                int num = sc.nextInt();
                sc.nextLine();

                System.out.println("========= Item Modify Menu ==========");
                System.out.println("1. Plus Quantity of \"" + item + "\"");
                System.out.println("2. Remove Quantity of \"" + item + "\"");
                System.out.println("3. Quit Item Modification");

                int modifySelect = sc.nextInt();
                sc.nextLine();

                if(modifySelect == 1)
                    modifyItem(item, num);
                else if(modifySelect == 2)
                    modifyItem(item, -num);

            }
            else if(menuSelect == 3) {
                System.out.print("Enter Item's name : ");
                String item = sc.nextLine();

                System.out.print("Do you really want to delete " + item + " ? ");
                System.out.println("1 : YES     2 : NO ");

                int delete = sc.nextInt();
                sc.nextLine();

                if(delete == 1)
                    deleteItem(item);
            }
            else if(menuSelect == 4)
                break;

            System.out.println("==================== Menu ====================");
            System.out.println("1. Add Item");
            System.out.println("2. Modify Item's quantity");
            System.out.println("3. Delete Item");
            System.out.println("4. Quit");

            menuSelect = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }


}