// write a program to create bank account system

package day28;
import java.util.Scanner;

public class question110 {
    
    Scanner sc = new Scanner(System.in);

    int[] accountNo = new int[100];
    String[] accountHolder = new String[100];
    double[] balance = new double[100];

    int count = 0;

    public void addAccount(){
        System.out.println("\n======== Add Account =======");

        System.out.print("Enter Account Number : ");
        accountNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name : ");
        accountHolder[count] = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        balance[count] = sc.nextDouble();

        count++;
        System.out.println("\nAccount Created Successfully");
    }

    public void displayAccount(){
        if (count == 0) {
            System.out.println("\nNo Accounts Available!");
            return;
        }

        System.out.println("\n==================================================================");
        System.out.printf("%-15s %-25s %-15s%n","Account No", "Account Holder", "Balance");
        System.out.println("==================================================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-15d %-25s ₹%-15.2f%n", accountNo[i], accountHolder[i], balance[i]);
        }

        System.out.println("==================================================================");
    }

    public void searchAccount(){

        System.out.print("Enter Account number to search : ");
        int id = sc.nextInt();

        for (int i = 0; i <count; i++) {
            if(accountNo[i] == id){
                System.out.println("======= Account Found! =======");
                System.out.println("Account Number : " + accountNo[i]);
                System.out.println("Account Holder : " + accountHolder[i]);
                System.out.println("Balance        : ₹" + balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found!");
    }

    public void depositMoney() {

        System.out.print("\nEnter Account Number : ");
        int acc = sc.nextInt();

        for(int i = 0; i < count; i++){

            if(accountNo[i] == acc) {

                System.out.print("Enter Deposit Amount : ");
                double amount = sc.nextDouble();

                balance[i] += amount;

                System.out.println("\nAmount Deposited Successfully!");
                System.out.println("Current Balance : ₹" + balance[i]);

                return;
            }
        }

        System.out.println("\nAccount Not Found!");
    }

    public void withdrawMoney() {

        System.out.print("\nEnter Account Number : ");
        int acc = sc.nextInt();

        for(int i = 0; i < count; i++){

            if(accountNo[i] == acc){

                System.out.print("Enter Withdrawal Amount : ");
                double amount = sc.nextDouble();

                if(amount <= balance[i]){

                    balance[i] -= amount;

                    System.out.println("\nAmount Withdrawn Successfully!");
                    System.out.println("Remaining Balance : ₹" + balance[i]);

                }else{

                    System.out.println("\nInsufficient Balance!");

                }

                return;
            }
        }

    }

    public static void main(String[] args) {
        
        question110 bank = new question110();
        int choice;

        do{
            System.out.println("\n========================================");
            System.out.println("         BANK ACCOUNT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.println("========================================");

            System.out.print("Enter Your Choice : ");
            choice = bank.sc.nextInt();

            switch (choice) {

                case 1:
                   bank.addAccount();
                    break;

                case 2:
                    bank.displayAccount();
                    break;

                case 3:
                    bank.searchAccount();
                    break;

                case 4:
                    bank.depositMoney();
                    break;

                case 5:
                    bank.withdrawMoney();
                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println(" Thank You for Using Bank System ");
                    System.out.println("========================================");
                    bank.sc.close();
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        }while(choice != 6);
    }

}package day28;
import java.util.Scanner;
public class question110 {
    
    Scanner sc = new Scanner(System.in);

    int[] accountNo = new int[100];
    String[] accountHolder = new String[100];
    double[] balance = new double[100];

    int count = 0;

    public void addAccount(){
        System.out.println("\n======== Add Account =======");

        System.out.print("Enter Account Number : ");
        accountNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name : ");
        accountHolder[count] = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        balance[count] = sc.nextDouble();

        count++;
        System.out.println("\nAccount Created Successfully");
    }

    public void displayAccount(){
        if (count == 0) {
            System.out.println("\nNo Accounts Available!");
            return;
        }

        System.out.println("\n==================================================================");
        System.out.printf("%-15s %-25s %-15s%n","Account No", "Account Holder", "Balance");
        System.out.println("==================================================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-15d %-25s ₹%-15.2f%n", accountNo[i], accountHolder[i], balance[i]);
        }

        System.out.println("==================================================================");
    }

    public void searchAccount(){

        System.out.print("Enter Account number to search : ");
        int id = sc.nextInt();

        for (int i = 0; i <count; i++) {
            if(accountNo[i] == id){
                System.out.println("======= Account Found! =======");
                System.out.println("Account Number : " + accountNo[i]);
                System.out.println("Account Holder : " + accountHolder[i]);
                System.out.println("Balance        : ₹" + balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found!");
    }

    public void depositMoney() {

        System.out.print("\nEnter Account Number : ");
        int acc = sc.nextInt();

        for(int i = 0; i < count; i++){

            if(accountNo[i] == acc) {

                System.out.print("Enter Deposit Amount : ");
                double amount = sc.nextDouble();

                balance[i] += amount;

                System.out.println("\nAmount Deposited Successfully!");
                System.out.println("Current Balance : ₹" + balance[i]);

                return;
            }
        }

        System.out.println("\nAccount Not Found!");
    }

    public void withdrawMoney() {

        System.out.print("\nEnter Account Number : ");
        int acc = sc.nextInt();

        for(int i = 0; i < count; i++){

            if(accountNo[i] == acc){

                System.out.print("Enter Withdrawal Amount : ");
                double amount = sc.nextDouble();

                if(amount <= balance[i]){

                    balance[i] -= amount;

                    System.out.println("\nAmount Withdrawn Successfully!");
                    System.out.println("Remaining Balance : ₹" + balance[i]);

                }else{

                    System.out.println("\nInsufficient Balance!");

                }

                return;
            }
        }

    }

    public static void main(String[] args) {
        
        question110 bank = new question110();
        int choice;

        do{
            System.out.println("\n========================================");
            System.out.println("         BANK ACCOUNT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.println("========================================");

            System.out.print("Enter Your Choice : ");
            choice = bank.sc.nextInt();

            switch (choice) {

                case 1:
                   bank.addAccount();
                    break;

                case 2:
                    bank.displayAccount();
                    break;

                case 3:
                    bank.searchAccount();
                    break;

                case 4:
                    bank.depositMoney();
                    break;

                case 5:
                    bank.withdrawMoney();
                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println(" Thank You for Using Bank System ");
                    System.out.println("========================================");
                    bank.sc.close();
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        }while(choice != 6);
    }

}
