// write a program to create number guessing game

package day26;
import java.util.Random;

import java.util.Scanner;
public class question101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int attempt  = 0;

        System.out.println("====================");
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("====================");
        System.out.println("Guess a number between 1 to 100 ");
        System.out.println("-------------------------------");

        while(true){
            System.out.print("Enter your guess : ");
            if(!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();
                continue;
            }
            guess = sc.nextInt();
             if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            attempt++;
            if(guess > number){
                System.out.println("--------------------");
                System.out.println("Too high!, try again");
                System.out.println("--------------------");
            }else if(guess < number){
                System.out.println("--------------------");
                System.out.println("Too low! , try again");
                System.out.println("--------------------");
            }else{
                System.out.println("--------------------------------");
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Number: " + number);
                System.out.println("Attempts: " + attempt);
                System.out.println("--------------------------------");
                break;
            }
        }
        sc.close();
    }
}
