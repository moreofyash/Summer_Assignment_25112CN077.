// write a program to create menu driven array operating system

package day29;
import java.util.Scanner;

public class question114 {

    public static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("      MENU DRIVEN ARRAY OPERATIONS");
        System.out.println("========================================");
        System.out.println("1. Enter Array");
        System.out.println("2. Display Array");
        System.out.println("3. Search Element");
        System.out.println("4. Find Maximum");
        System.out.println("5. Find Minimum");
        System.out.println("6. Calculate Sum");
        System.out.println("7. Calculate Average");
        System.out.println("8. Sort Ascending");
        System.out.println("9. Sort Descending");
        System.out.println("10. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public static void inputArray(int arr[], Scanner sc) {
        System.out.println("\nEnter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int arr[]) {
        System.out.println("\nArray Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void searchElement(int arr[], int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    public static int findMaximum(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMinimum(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int findSum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double findAverage(int arr[]) {
        return (double) findSum(arr) / arr.length;
    }

    public static void sortAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted in ascending order.");
    }

    public static void sortDescending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted in descending order.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int choice;

        while (true) {

            displayMenu();
            choice = sc.nextInt();

            if (choice == 10) {
                System.out.println("\n========================================");
                System.out.println(" Thank You for Using Array Operations!");
                System.out.println("========================================");
                break;
            }

            switch (choice) {

                case 1:
                    inputArray(arr, sc);
                    break;

                case 2:
                    displayArray(arr);
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    searchElement(arr, key);
                    break;

                case 4:
                    System.out.println("Maximum Element = " + findMaximum(arr));
                    break;

                case 5:
                    System.out.println("Minimum Element = " + findMinimum(arr));
                    break;

                case 6:
                    System.out.println("Sum = " + findSum(arr));
                    break;

                case 7:
                    System.out.println("Average = " + findAverage(arr));
                    break;

                case 8:
                    sortAscending(arr);
                    displayArray(arr);
                    break;

                case 9:
                    sortDescending(arr);
                    displayArray(arr);
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }

        sc.close();
    }
}
