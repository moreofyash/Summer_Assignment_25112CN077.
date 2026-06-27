// write a program to create atm simulation

package day26;
import java.util.Scanner;

public class question103 {
        public static void pressEnterToContinue(Scanner sc) {
        System.out.println("\nPress Enter to return to the menu...");
        sc.nextLine(); 
        sc.nextLine(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yourPin = 5875;
        int enteredPin;
        int amount;
        int choice;
        int balance = 10000;

        System.out.println("===== ATM =====");

        System.out.print("Enter your pin : ");
        enteredPin = sc.nextInt();

        if(yourPin != enteredPin){
            System.out.println("Incorrect pin");
            sc.close();
            return;
        }

        System.out.println("Login successful");

        do{
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance : press(1)");
            System.out.println("2. Deposit Money : press(2)");
            System.out.println("3. Withdraw Money : press(3)");
            System.out.println("4. Exit : press(4)");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("Current Balance : "+ balance);
                    pressEnterToContinue(sc);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();

                    if(amount <= 0){
                        System.out.println("Invalid amount");
                    }else{
                        balance += amount;
                        System.out.println("Deposit Successful.");
                        System.out.println("Current Balance: " + balance);
                    }
                    pressEnterToContinue(sc);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: " + balance);
                    }
                    pressEnterToContinue(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;           
                default:
                    System.out.println("Invalid choice! Please enter 1 to 4.");
                    pressEnterToContinue(sc);
            }

        } while (choice != 4);

        sc.close();
    }
}
