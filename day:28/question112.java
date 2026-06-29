// write a program to create contact management system 

package day28;
import java.util.Scanner;

public class question112 {

    Scanner sc = new Scanner(System.in);

    int[] contactId = new int[100];
    String[] contactName = new String[100];
    String[] phoneNumber = new String[100];
    String[] email = new String[100];
    int count = 0;

    public void addContact() {

        System.out.println("\n========== Add Contact ==========");

        System.out.print("Enter Contact ID : ");
        contactId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Contact Name : ");
        contactName[count] = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        phoneNumber[count] = sc.nextLine();

        System.out.print("Enter Email : ");
        email[count] = sc.nextLine();

        count++;

        System.out.println("\nContact Added Successfully!");
    }

    public void displayContacts() {

        if (count == 0) {
            System.out.println("\nNo Contacts Available!");
            return;
        }

        System.out.println("\n=================================================================================");
        System.out.printf("%-12s %-20s %-18s %-30s%n","Contact ID", "Name", "Phone", "Email");
        System.out.println("=================================================================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-12d %-20s %-18s %-30s%n",contactId[i], contactName[i], phoneNumber[i], email[i]);
        }
        System.out.println("=================================================================================");
    }

    public void searchContact() {

        System.out.print("\nEnter Contact ID to Search : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (contactId[i] == id) {

                System.out.println("\n========== Contact Found ==========");
                System.out.println("Contact ID   : " + contactId[i]);
                System.out.println("Name         : " + contactName[i]);
                System.out.println("Phone Number : " + phoneNumber[i]);
                System.out.println("Email        : " + email[i]);

                return;
            }
        }

        System.out.println("\nContact Not Found!");
    }

    public void updateContact() {

        System.out.print("\nEnter Contact ID to Update : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (contactId[i] == id) {

                System.out.print("Enter New Phone Number : ");
                phoneNumber[i] = sc.nextLine();

                System.out.println("\nContact Updated Successfully!");

                return;
            }
        }

        System.out.println("\nContact Not Found!");
    }

    public void deleteContact() {

        System.out.print("\nEnter Contact ID to Delete : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (contactId[i] == id) {

                for (int j = i; j < count - 1; j++) {

                    contactId[j] = contactId[j + 1];
                    contactName[j] = contactName[j + 1];
                    phoneNumber[j] = phoneNumber[j + 1];
                    email[j] = email[j + 1];

                }

                count--;

                System.out.println("\nContact Deleted Successfully!");

                return;
            }
        }

        System.out.println("\nContact Not Found!");
    }

    public static void main(String[] args) {

        question112 contact = new question112();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("      CONTACT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.println("========================================");

            System.out.print("Enter Your Choice : ");
            choice = contact.sc.nextInt();

            switch (choice) {

                case 1:
                    contact.addContact();
                    break;

                case 2:
                    contact.displayContacts();
                    break;

                case 3:
                    contact.searchContact();
                    break;

                case 4:
                    contact.updateContact();
                    break;

                case 5:
                    contact.deleteContact();
                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println(" Thank You for Using Contact System ");
                    System.out.println("========================================");
                    contact.sc.close();
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        } while (choice != 6);
    }
}
