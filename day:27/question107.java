// write a program to create salary management system

package day27;
import java.util.Scanner;

public class question107 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MAX = 100;
        int[] empId = new int[MAX];
        String[] empName = new String[MAX];
        double[] basicSalary = new double[MAX];
        double[] bonus = new double[MAX];
        double[] totalSalary = new double[MAX];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Update Salary Record");
            System.out.println("5. Delete Salary Record");
            System.out.println("6. Calculate Average Salary");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    if(count == MAX){
                        System.out.println("Records are Full.");
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

                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    bonus[count] = sc.nextDouble();

                    totalSalary[count] = basicSalary[count] + bonus[count];

                    count++;

                    System.out.println("Salary Record Added Successfully.");
                    break;
                case 2:
                    if(count == 0){
                        System.out.println("No Records Found.");
                    }else{
                        System.out.println("\n--------------------------------------------------------------------------");
                        System.out.printf("%-8s %-20s %-12s %-10s %-12s\n","ID", "Name", "Basic", "Bonus", "Total");
                        System.out.println("--------------------------------------------------------------------------");

                        for(int i = 0; i < count; i++){
                            System.out.printf("%-8d %-20s %-12.2f %-10.2f %-12.2f\n", empId[i], empName[i], basicSalary[i], bonus[i], totalSalary[i]);
                        }
                        System.out.println("--------------------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++){

                        if(empId[i] == searchId){

                            System.out.println("\nSalary Record Found");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("Bonus       : " + bonus[i]);
                            System.out.println("Total Salary: " + totalSalary[i]);

                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Record Not Found.");
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

                            System.out.print("Enter New Basic Salary: ");
                            basicSalary[i] = sc.nextDouble();

                            System.out.print("Enter New Bonus: ");
                            bonus[i] = sc.nextDouble();

                            totalSalary[i] = basicSalary[i] + bonus[i];

                            System.out.println("Salary Record Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Record Not Found.");
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
                                basicSalary[j] = basicSalary[j + 1];
                                bonus[j] = bonus[j + 1];
                                totalSalary[j] = totalSalary[j + 1];
                            }

                            count--;

                            System.out.println("Salary Record Deleted Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Record Not Found.");
                    break;
                case 6:
                    if(count == 0){
                        System.out.println("No Records Found.");
                    }else{
                        double sum = 0;
                        for(int i = 0; i < count; i++){
                            sum += totalSalary[i];
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
