// write a program to create tiicket booking system 

package day28;
import java.util.Scanner;

public class question111 {

    Scanner sc = new Scanner(System.in);

    int[] ticketId = new int[100];
    String[] passengerName = new String[100];
    String[] destination = new String[100];
    int[] seats = new int[100];
    int count = 0;

    public void addTicket() {

        System.out.println("\n========== Add Ticket ==========");

        System.out.print("Enter Ticket ID : ");
        ticketId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name : ");
        passengerName[count] = sc.nextLine();

        System.out.print("Enter Destination : ");
        destination[count] = sc.nextLine();

        System.out.print("Enter Number of Seats : ");
        seats[count] = sc.nextInt();

        count++;

        System.out.println("\nTicket Added Successfully!");
    }

    public void displayTickets() {

        if (count == 0) {
            System.out.println("\nNo Tickets Available!");
            return;
        }

        System.out.println("\n======================================================================");
        System.out.printf("%-12s %-20s %-20s %-10s%n",
                "Ticket ID", "Passenger", "Destination", "Seats");
        System.out.println("======================================================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-12d %-20s %-20s %-10d%n",
                    ticketId[i], passengerName[i], destination[i], seats[i]);
        }

        System.out.println("======================================================================");
    }

    public void searchTicket() {

        System.out.print("\nEnter Ticket ID to Search : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (ticketId[i] == id) {
                System.out.println("\n========== Ticket Found ==========");
                System.out.println("Ticket ID      : " + ticketId[i]);
                System.out.println("Passenger Name : " + passengerName[i]);
                System.out.println("Destination    : " + destination[i]);
                System.out.println("Seats          : " + seats[i]);

                return;
            }
        }

        System.out.println("\nTicket Not Found!");
    }

    public void bookTicket() {

        System.out.print("\nEnter Ticket ID to Book : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (ticketId[i] == id) {
                if (seats[i] > 0) {
                    seats[i]--;
                    System.out.println("\nTicket Booked Successfully!");
                    System.out.println("Remaining Seats : " + seats[i]);

                } else {
                    System.out.println("\nNo Seats Available!");
                }
                return;
            }
        }

        System.out.println("\nTicket Not Found!");
    }

    public void cancelTicket() {
        System.out.print("\nEnter Ticket ID to Cancel : ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if(ticketId[i] == id){
                seats[i]++;
                System.out.println("\nTicket Cancelled Successfully!");
                System.out.println("Available Seats : " + seats[i]);
                return;
            }
        }
        System.out.println("\nTicket Not Found!");
    }

    public static void main(String[] args) {

        question111 ticket = new question111();
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("        TICKET BOOKING SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Book Ticket");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.println("========================================");

            System.out.print("Enter Your Choice : ");
            choice = ticket.sc.nextInt();

            switch(choice){

                case 1:
                    ticket.addTicket();
                    break;

                case 2:
                    ticket.displayTickets();
                    break;

                case 3:
                    ticket.searchTicket();
                    break;

                case 4:
                    ticket.bookTicket();
                    break;

                case 5:
                    ticket.cancelTicket();
                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println(" Thank You for Using Ticket System ");
                    System.out.println("========================================");
                    ticket.sc.close();
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
                    break;
            }
        }while(choice != 6);
    }
}
