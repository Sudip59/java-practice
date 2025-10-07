/*
SUDIP KHADKA
9/13/2025
MATH QUIZ ASSIGNMENT
*/

package mathquiz;

import java.util.Scanner;
import java.util.Random;

public class MathQuiz {

    public static final double PASS_PERCENT = 70;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int quest;  
        int correctCount; 
        double percentage = 0; 

        do {
            do {
                System.out.println("How many questions would you like to solve?");
                quest = input.nextInt();
            } while (quest < 0);

            
            if (quest == 0) {
                continue;
            }

            correctCount = 0; 

            for (int i = 0; i < quest; i++) {
                int num1 = random.nextInt(50) + 1;
                int num2 = random.nextInt(50) + 1;
                int sum = num1 + num2;

                System.out.print(num1 + " + " + num2 + " = ? ");
                int userAnswer = input.nextInt();

                if (userAnswer == sum) {
                    correctCount++;
                    System.out.println("Correct");
                } else {
                    System.out.println("Incorrect");
                }
            }

            percentage = (quest > 0) ? ((double) correctCount / quest) * 100 : 0;

            System.out.println("You got " + correctCount + " out of " + quest +
                    " correct which is " + percentage + "%.");

            if (percentage < PASS_PERCENT) {
                System.out.println("You did not pass this addition quiz. Please try again.\n");
            } else {
                System.out.println("You passed this addition quiz. Congratulations!");
            }

        } while (percentage < PASS_PERCENT); 
    }
}



