// write a program to create mini library system

package day30;
import java.util.Scanner;

public class question118 {

    Scanner sc = new Scanner(System.in);
    
    String[] bookName = new String[100];
    int[] bookId = new int[100];
    String[] author = new String[100];
    int[] quantity = new int[100];
    int count = 0;

    public void addBooks(){
        System.out.print("Enter Book-ID : ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name : ");
        bookName[count] = sc.nextLine();
    
        System.out.print("Enter Author's Name : ");
        author[count] = sc.nextLine();

        System.out.print("Enter Quantity : ");
        quantity[count] = sc.nextInt();

        count++;
        System.out.println("=======================");
        System.out.println("Book Added Successfully!");
        System.out.println("=======================");
    }

    public void displayBooks(){
        if(count == 0){
            System.out.println("No Book Available!");
            return;
        }

        System.out.println("\n====================================================================");
        System.out.printf("%-10s %-25s %-20s %-10s%n","Book ID", "Book Name", "Author", "Quantity");
        System.out.println("====================================================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-10d %-25s %-20s %-10d%n",bookId[i], bookName[i], author[i], quantity[i]);
        }
        System.out.println("====================================================================");
    }

    public void searchBooks(){
        System.out.print("\nEnter Book ID to search : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if(id == bookId[i]){
                System.out.println("========= Book Found!========");
                System.out.println("Book Name : " + bookName[i]);
                System.out.println("Author : " + author[i]);
                System.out.println("Quantity : " + quantity[i]);
                System.out.println("==============================");
                return;
            }
        }

        System.out.println("Book Not Found!");
    }

    public void issueBook(){
        System.out.print("Enter Book ID to Issue : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if(bookId[i] == id){
                if(quantity[i] > 0){
                    quantity[i]--;
                    System.out.println("\nBook Issued Successfully");
                    System.out.println("Remaining Quantity : " +quantity[i]);
                }else{
                    System.out.println("Book not Available");
                }
                return;
            }
        }
        System.out.println("Book not Found!");
    }

    public void returnBook(){
        System.out.print("Enter Book ID to Return : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if(bookId[i] == id){
                quantity[i]++;
                System.out.println("\nBook Returned Successfully");
                System.out.println("Current Quantity : "+ quantity[i]);
                return;
            }
        }
        System.out.println("Book not Found!");
        
    }

    public static void main(String[] args) {
        question118 lib = new question118();

        int choice;

        do{
            System.out.println("=========================");
            System.out.println("Library Management System");
            System.out.println("=========================");
            System.out.println("1. Add Book : enter(1)");
            System.out.println("2. Display Books : enter(2)");
            System.out.println("3. Search Book : enter(3)");
            System.out.println("4. Issue Book : enter(4)");
            System.out.println("5. Return Book : enter(5)");
            System.out.println("6. Exit : enter(6)");

            System.out.print("Enter your choice : ");
            choice = lib.sc.nextInt();

            switch (choice) {
                case 1:
                    lib.addBooks();
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    lib.searchBooks();
                    break;

                case 4:
                    lib.issueBook();
                    break;

                case 5:
                    lib.returnBook();
                    break;

                case 6:
                    System.out.println("==============================================");
                    System.out.println("Thank You! For using Library Mangement System");
                    System.out.println("==============================================");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    lib.sc.close();
                    break;
            }
        }while(choice != 6);
    }
}
