// write a program to create marksheet generation system

package day27;
import java.util.Scanner;

public class question108 {
    public static char getGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 60)
            return 'C';
        else if (percentage >= 33)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 100;

        int[] roll = new int[MAX];
        String[] name = new String[MAX];
        int[] java = new int[MAX];
        int[] python = new int[MAX];
        int[] dbms = new int[MAX];
        int[] total = new int[MAX];
        double[] percentage = new double[MAX];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== MARKSHEET GENERATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == MAX) {
                        System.out.println("Records are Full.");
                        break;
                    }

                    System.out.print("Enter Roll Number: ");
                    int newRoll = sc.nextInt();

                    boolean duplicate = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == newRoll) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Roll Number Already Exists.");
                        break;
                    }

                    roll[count] = newRoll;

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Java Marks: ");
                    java[count] = sc.nextInt();

                    System.out.print("Enter Python Marks: ");
                    python[count] = sc.nextInt();

                    System.out.print("Enter DBMS Marks: ");
                    dbms[count] = sc.nextInt();

                    total[count] = java[count] + python[count] + dbms[count];
                    percentage[count] = total[count] / 3.0;

                    count++;

                    System.out.println("Student Record Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {

                        System.out.println("\n--------------------------------------------------------------------------------------");
                        System.out.printf("%-8s %-15s %-8s %-8s %-8s %-8s %-12s %-8s\n",
                                "Roll", "Name", "Java", "Python", "DBMS", "Total", "Percentage", "Grade");
                        System.out.println("--------------------------------------------------------------------------------------");

                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-8d %-15s %-8d %-8d %-8d %-8d %-12.2f %-8c\n",
                                    roll[i], name[i], java[i], python[i], dbms[i],
                                    total[i], percentage[i], getGrade(percentage[i]));
                        }

                        System.out.println("--------------------------------------------------------------------------------------");
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == search) {

                            System.out.println("\nStudent Found");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Java Marks  : " + java[i]);
                            System.out.println("Python Marks: " + python[i]);
                            System.out.println("DBMS Marks  : " + dbms[i]);
                            System.out.println("Total Marks : " + total[i]);
                            System.out.printf("Percentage  : %.2f\n", percentage[i]);
                            System.out.println("Grade       : " + getGrade(percentage[i]));

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Roll Number: ");
                    int update = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == update) {

                            System.out.print("Enter New Java Marks: ");
                            java[i] = sc.nextInt();

                            System.out.print("Enter New Python Marks: ");
                            python[i] = sc.nextInt();

                            System.out.print("Enter New DBMS Marks: ");
                            dbms[i] = sc.nextInt();

                            total[i] = java[i] + python[i] + dbms[i];
                            percentage[i] = total[i] / 3.0;

                            System.out.println("Marks Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Roll Number: ");
                    int delete = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == delete) {

                            for (int j = i; j < count - 1; j++) {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                java[j] = java[j + 1];
                                python[j] = python[j + 1];
                                dbms[j] = dbms[j + 1];
                                total[j] = total[j + 1];
                                percentage[j] = percentage[j + 1];
                            }

                            count--;

                            System.out.println("Record Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
        sc.close();
    }
}
