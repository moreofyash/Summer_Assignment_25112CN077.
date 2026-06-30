// write a program to create inventory management system

package day29;
import java.util.Scanner;

public class question116 {

    Scanner sc = new Scanner(System.in);

    int[] itemId = new int[100];
    String[] itemName = new String[100];
    int[] quantity = new int[100];
    double[] price = new double[100];

    int count = 0;

    public void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("      INVENTORY MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Item");
        System.out.println("2. Display Items");
        System.out.println("3. Search Item");
        System.out.println("4. Update Quantity");
        System.out.println("5. Delete Item");
        System.out.println("6. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public void addItem() {

        System.out.println("\n===== Add Item =====");

        System.out.print("Enter Item ID: ");
        itemId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        itemName[count] = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity[count] = sc.nextInt();

        System.out.print("Enter Price: ");
        price[count] = sc.nextDouble();

        count++;

        System.out.println("Item Added Successfully!");
    }

    public void displayItems() {

        if (count == 0) {
            System.out.println("No Items Available.");
            return;
        }

        System.out.println("\nID\tName\t\tQuantity\tPrice");

        for (int i = 0; i < count; i++) {
            System.out.println(itemId[i] + "\t" + itemName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
        }
    }

    public void searchItem() {

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (itemId[i] == id) {

                System.out.println("\nItem Found");
                System.out.println("ID: " + itemId[i]);
                System.out.println("Name: " + itemName[i]);
                System.out.println("Quantity: " + quantity[i]);
                System.out.println("Price: " + price[i]);
                return;
            }
        }

        System.out.println("Item Not Found.");
    }

    public void updateQuantity() {

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (itemId[i] == id) {

                System.out.print("Enter New Quantity: ");
                quantity[i] = sc.nextInt();

                System.out.println("Quantity Updated Successfully!");
                return;
            }
        }

        System.out.println("Item Not Found.");
    }

    public void deleteItem() {

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (itemId[i] == id) {

                for (int j = i; j < count - 1; j++) {
                    itemId[j] = itemId[j + 1];
                    itemName[j] = itemName[j + 1];
                    quantity[j] = quantity[j + 1];
                    price[j] = price[j + 1];
                }

                count--;
                System.out.println("Item Deleted Successfully!");
                return;
            }
        }
        System.out.println("Item Not Found.");
    }

    public static void main(String[] args) {

        question116 obj = new question116();
        int choice;

        while(true){

            obj.displayMenu();
            choice = obj.sc.nextInt();

            switch(choice){

                case 1:
                    obj.addItem();
                    break;

                case 2:
                    obj.displayItems();
                    break;

                case 3:
                    obj.searchItem();
                    break;

                case 4:
                    obj.updateQuantity();
                    break;

                case 5:
                    obj.deleteItem();
                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println(" Thank You for Using Inventory System!");
                    System.out.println("========================================");
                    obj.sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
