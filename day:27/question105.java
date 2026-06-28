// write a program to create student record management system

package day27;
import java.util.*;

public class question105 {
    public static char getGrade(int marks){
        if(marks >= 90 && marks <= 100){
            return 'A';
        }else if(marks >= 80){
            return 'B';
        }else if(marks >= 60){
            return 'C';
        }else if( marks >= 33){
            return 'D';
        }else{
            return 'F';
        }  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int[] roll = new int[max];
        String[] name = new String[max];
        int[] marks = new int[max];

        int count = 0;
        int choice;

        do{
            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student : enter(1)");
            System.out.println("2. Display Students : enter(2)");
            System.out.println("3. Search Student : enter(3)");
            System.out.println("4. Update Student : enter(4)");
            System.out.println("5. Delete Student : enter(5)");
            System.out.println("6. Calculate Average Marks : enter(6)");
            System.out.println("7. Exit : enter(7)");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    if(count == max){
                        System.out.println("Record is FULL!");
                        break;
                    }

                    System.out.print("Enter Roll Number : ");
                    int newRoll = sc.nextInt();

                    boolean duplicate = false;

                    for(int i = 0; i < count; i++){
                        if(roll[i] == newRoll){
                            duplicate = true;
                            break;
                        }
                    }

                    if(duplicate){
                        System.out.println("Roll Number Already Exists!");
                        break;
                    }

                    roll[count] = newRoll;
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    marks[count] = sc.nextInt();

                    count++;

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                     if(count == 0){
                        System.out.println("No Records Found.");
                    }else{

                        System.out.println("\n------------------------------------------------------");
                        System.out.printf("%-10s %-20s %-10s %-10s\n", "Roll", "Name", "Marks", "Grade");
                        System.out.println("------------------------------------------------------");

                        for (int i = 0; i < count; i++) {

                            System.out.printf("%-10d %-20s %-10d %-10c\n",
                                    roll[i], name[i], marks[i], getGrade(marks[i]));
                        }

                        System.out.println("------------------------------------------------------");
                    }

                    break;    
                case 3:
                    System.out.print("Enter Roll Number : ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == search) {

                            System.out.println("\nStudent Found");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Marks       : " + marks[i]);
                            System.out.println("Grade       : " + getGrade(marks[i]));

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;
                case 4:
                    System.out.print("Enter Roll Number : ");
                    int updateRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == updateRoll) {

                            sc.nextLine();

                            System.out.print("Enter New Name : ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Marks : ");
                            marks[i] = sc.nextInt();

                            System.out.println("Record Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");

                    break;
                case 5:
                    System.out.print("Enter Roll Number : ");
                    int deleteRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == deleteRoll) {

                            for (int j = i; j < count - 1; j++) {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                marks[j] = marks[j + 1];
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
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {

                        int sum = 0;

                        for (int i = 0; i < count; i++) {
                            sum += marks[i];
                        }

                        double average = (double) sum / count;

                        System.out.printf("Average Marks = %.2f\n", average);
                    }

                    break;
                case 7:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice != 7);
        sc.close();
    }
}
