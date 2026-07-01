// write a program to develop complete mini project using arrays strings and functions 

package day30;
import java.util.Scanner;

public class question120 {
    Scanner sc = new Scanner(System.in);

    int[] rollNo = new int[100];
    String[] studentName = new String[100];
    String[] course = new String[100];
    double[] marks = new double[100];
    int studentCount = 0;

    int[] empId = new int[100];
    String[] empName = new String[100];
    String[] department = new String[100];
    double[] salary = new double[100];
    int employeeCount = 0;

    public void menu(){
        int choice;
        do{
            System.out.println("\n======================================");
            System.out.println("     COLLEGE MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Student Management");
            System.out.println("2. Employee Management");
            System.out.println("3. Statistics & Reports");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    studentMenu();
                    break;

                case 2:
                    employeeMenu();
                    break;

                case 3:
                    reportMenu();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }while(choice != 4);
    }

    public static void main(String[] args) {

        question120 obj = new question120();
        obj.menu();
    }

        public void studentMenu() {
        int choice;
        do {
            System.out.println("\n========== STUDENT MANAGEMENT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Back");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }while (choice != 6);
    }

    public void addStudent() {
        System.out.println("\n------- Add Student -------");
        System.out.print("Enter Roll Number : ");
        rollNo[studentCount] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        studentName[studentCount] = sc.nextLine();

        System.out.print("Enter Course : ");
        course[studentCount] = sc.nextLine();

        System.out.print("Enter Marks : ");
        marks[studentCount] = sc.nextDouble();

        studentCount++;
        System.out.println("Student Added Successfully.");
    }

    public void displayStudents() {
        if(studentCount == 0){
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.println("\nRoll No\tName\t\tCourse\t\tMarks");
        for(int i = 0; i < studentCount; i++){
            System.out.println(rollNo[i] + "\t" + studentName[i] + "\t\t" + course[i] + "\t\t" + marks[i]);
        }
    }

    public void searchStudent() {
        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();
        for(int i = 0; i < studentCount; i++){
            if(rollNo[i] == roll){
                System.out.println("\nStudent Found");
                System.out.println("Roll Number : " + rollNo[i]);
                System.out.println("Name        : " + studentName[i]);
                System.out.println("Course      : " + course[i]);
                System.out.println("Marks       : " + marks[i]);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void updateStudent() {

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < studentCount; i++){
            if(rollNo[i] == roll){

                System.out.print("Enter New Name : ");
                studentName[i] = sc.nextLine();

                System.out.print("Enter New Course : ");
                course[i] = sc.nextLine();

                System.out.print("Enter New Marks : ");
                marks[i] = sc.nextDouble();

                System.out.println("Student Updated Successfully.");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void deleteStudent() {
        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        for(int i = 0; i < studentCount; i++){
            if(rollNo[i] == roll){
                for(int j = i; j < studentCount - 1; j++){
                    rollNo[j] = rollNo[j + 1];
                    studentName[j] = studentName[j + 1];
                    course[j] = course[j + 1];
                    marks[j] = marks[j + 1];
                }
                studentCount--;
                System.out.println("Student Deleted Successfully.");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public void employeeMenu() {
        int choice;
        do{
            System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Back");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateEmployee();
                    break;

                case 5:
                    deleteEmployee();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }while (choice != 6);
    }

    public void addEmployee() {
        System.out.println("\n------- Add Employee -------");
        System.out.print("Enter Employee ID : ");
        empId[employeeCount] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        empName[employeeCount] = sc.nextLine();

        System.out.print("Enter Department : ");
        department[employeeCount] = sc.nextLine();

        System.out.print("Enter Salary : ");
        salary[employeeCount] = sc.nextDouble();

        employeeCount++;

        System.out.println("Employee Added Successfully.");
    }

    public void displayEmployees() {
        if(employeeCount == 0){
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\nID\tName\t\tDepartment\tSalary");
        for(int i = 0; i < employeeCount; i++){
            System.out.println(empId[i] + "\t" +
                    empName[i] + "\t\t" +
                    department[i] + "\t\t" +
                    salary[i]);
        }
    }

    public void searchEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        for(int i = 0; i < employeeCount; i++){
            if(empId[i] == id){
                System.out.println("\nEmployee Found");
                System.out.println("Employee ID : " + empId[i]);
                System.out.println("Name        : " + empName[i]);
                System.out.println("Department  : " + department[i]);
                System.out.println("Salary      : " + salary[i]);
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public void updateEmployee() {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < employeeCount; i++){
            if(empId[i] == id){

                System.out.print("Enter New Name : ");
                empName[i] = sc.nextLine();

                System.out.print("Enter New Department : ");
                department[i] = sc.nextLine();

                System.out.print("Enter New Salary : ");
                salary[i] = sc.nextDouble();

                System.out.println("Employee Updated Successfully.");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        for(int i = 0; i < employeeCount; i++){
            if(empId[i] == id){
                for(int j = i; j < employeeCount - 1; j++){
                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];
                }
                employeeCount--;
                System.out.println("Employee Deleted Successfully.");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public void reportMenu() {
        int choice;

        do{

            System.out.println("\n========== STATISTICS & REPORTS ==========");
            System.out.println("1. Student Statistics");
            System.out.println("2. Employee Statistics");
            System.out.println("3. College Summary");
            System.out.println("4. Back");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    studentStatistics();
                    break;

                case 2:
                    employeeStatistics();
                    break;

                case 3:
                    collegeSummary();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }while (choice != 4);
    }

    public void studentStatistics() {
        if(studentCount == 0){
            System.out.println("No Student Records Found.");
            return;
        }
        double total = 0;
        int topper = 0;
        for(int i = 0; i < studentCount; i++){
            total += marks[i];
            if(marks[i] > marks[topper]){
                topper = i;
            }
        }
        System.out.println("\n======= STUDENT STATISTICS =======");
        System.out.println("Total Students : " + studentCount);
        System.out.println("Average Marks  : " + (total / studentCount));
        System.out.println("Topper         : " + studentName[topper]);
        System.out.println("Highest Marks  : " + marks[topper]);
    }

    public void employeeStatistics() {
        if(employeeCount == 0){
            System.out.println("No Employee Records Found.");
            return;
        }
        double total = 0;
        int highest = 0;
        for(int i = 0; i < employeeCount; i++){
            total += salary[i];
            if(salary[i] > salary[highest]){
                highest = i;
            }
        }
        System.out.println("\n======= EMPLOYEE STATISTICS =======");
        System.out.println("Total Employees : " + employeeCount);
        System.out.println("Average Salary  : " + (total / employeeCount));
        System.out.println("Highest Salary  : " + salary[highest]);
        System.out.println("Employee Name   : " + empName[highest]);
    }

    public void collegeSummary() {
        System.out.println("\n========== COLLEGE SUMMARY ==========");
        System.out.println("Total Students  : " + studentCount);
        System.out.println("Total Employees : " + employeeCount);
    }
}
