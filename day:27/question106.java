// write a program to create employee management system

package day27;
import java.util.Scanner;

public class question106 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = 100;
        int[] empId = new int[MAX];
        String[] empName = new String[MAX];
        String[] department = new String[MAX];
        double[] salary = new double[MAX];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Average Salary");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if(count == MAX){
                        System.out.println("Employee Record is Full.");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    int newId = sc.nextInt();

                    boolean duplicate = false;

                    for(int i = 0; i < count; i++){
                        if(empId[i] == newId){
                            duplicate = true;
                            break;
                        }
                    }

                    if(duplicate){
                        System.out.println("Employee ID Already Exists.");
                        break;
                    }

                    empId[count] = newId;
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Department: ");
                    department[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:

                    if(count == 0){
                        System.out.println("No Employee Records Found.");
                    }else{

                        System.out.println("\n----------------------------------------------------------------");
                        System.out.printf("%-10s %-20s %-15s %-10s\n","ID", "Name", "Department", "Salary");
                        System.out.println("----------------------------------------------------------------");

                        for(int i = 0; i < count; i++){
                            System.out.printf("%-10d %-20s %-15s %-10.2f\n",
                                    empId[i], empName[i], department[i], salary[i]);
                        }
                        System.out.println("----------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++){

                        if(empId[i] == searchId){

                            System.out.println("\nEmployee Found");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Salary      : " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Employee Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++){

                        if(empId[i] == updateId){
                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            empName[i] = sc.nextLine();

                            System.out.print("Enter New Department: ");
                            department[i] = sc.nextLine();

                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();

                            System.out.println("Employee Record Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Employee Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++){

                        if(empId[i] == deleteId){

                            for(int j = i; j < count - 1; j++){
                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
                            }
                            count--;
                            System.out.println("Employee Record Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Employee Not Found.");
                    }
                    break;
                case 6:
                    if(count == 0){
                        System.out.println("No Employee Records Found.");
                    }else{
                        double sum = 0;
                        for(int i = 0; i < count; i++){
                            sum += salary[i];
                        }
                        double average = sum / count;
                        System.out.printf("Average Salary = %.2f\n", average);
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
