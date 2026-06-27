// write a program to create quiz application

package day26;
import java.util.Scanner;

public class question104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1.What is the capital of India?",
            "2.How many protons are in Sodium Atom?",
            "3.What is squareroot of 2?"
        };

        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"},
            {"A. 12", "B. 13", "C. 10", "D. 11"},
            {"A. 1.212", "B. 1.313", "C. 1.414", "D. 1.515"}
        };

        char[] answers = {'B', 'D', 'C'};
        
        int score = 0;
        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.println("Enter your answer : (A/B/C/D) ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if(userAnswer == answers[i]){
                System.out.println("Correct answer");
                score++;
            }else{
                System.out.println("Wrong answer");
                System.out.println("Correct answer : "+ answers[i]);
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
