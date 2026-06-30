// write a program to create menu driven string operating system 

package day29;
import java.util.Scanner;

public class question115 {

    public static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("     MENU DRIVEN STRING OPERATIONS");
        System.out.println("========================================");
        System.out.println("1. Enter String");
        System.out.println("2. Display String");
        System.out.println("3. Reverse String");
        System.out.println("4. Convert to Uppercase");
        System.out.println("5. Convert to Lowercase");
        System.out.println("6. Check Palindrome");
        System.out.println("7. Count Vowels and Consonants");
        System.out.println("8. Count Words");
        System.out.println("9. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public static void displayString(String str) {
        System.out.println("String: " + str);
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static String toLower(String str) {
        return str.toLowerCase();
    }

    public static boolean isPalindrome(String str) {
        String rev = reverseString(str);
        return str.equalsIgnoreCase(rev);
    }

    public static void countVowelsConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static int countWords(String str) {

        if (str.trim().isEmpty())
            return 0;

        String words[] = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";

        int choice;

        while (true) {

            displayMenu();
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 9) {
                System.out.println("\n========================================");
                System.out.println(" Thank You for Using String Operations!");
                System.out.println("========================================");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter String: ");
                    str = sc.nextLine();
                    break;

                case 2:
                    displayString(str);
                    break;

                case 3:
                    System.out.println("Reversed String: " + reverseString(str));
                    break;

                case 4:
                    System.out.println("Uppercase: " + toUpper(str));
                    break;

                case 5:
                    System.out.println("Lowercase: " + toLower(str));
                    break;

                case 6:
                    if (isPalindrome(str))
                        System.out.println("String is Palindrome.");
                    else
                        System.out.println("String is Not Palindrome.");
                    break;

                case 7:
                    countVowelsConsonants(str);
                    break;

                case 8:
                    System.out.println("Number of Words = " + countWords(str));
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
        sc.close();
    }
}
