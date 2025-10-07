/*
SUDIP KHADKA
GUESSIN GAME ASSIGNMENT
9/8/2025
*/
package guessinggame;

import javax.swing.JOptionPane;
public class GuessingGame {

    public static void main(String[] args) {

        int computerNumber = (int) (Math.random()*10+1);
        
        System.out.println("The Computer generated random numbers: " + computerNumber);
        
        int count = 0;
        int userAnswer = 0;
        while(computerNumber != userAnswer){
            count++;
        String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 10");
            userAnswer = Integer.parseInt(response);
        System.out.println("Try Number: " + count);
            if(userAnswer <= 0  || userAnswer > 10){
                System.out.println("Invalid Guess.");
            }
            else if(userAnswer==computerNumber){
                    System.out.println("Correct Guess");
                }
            else if (userAnswer > computerNumber){
                        System.out.println("Incorrect, Your guess was too high.");
                        }
                else{
                        System.out.println("Incorrect, Your guess was too low.");
                        }
        }
        if(count==1){
            System.out.println("You are a psychic!");
        }else if(count ==2){
            System.out.println("Amazing!!");
        }else if(count == 3 ){
            System.out.println("Great Job!!!");
        }else{
            System.out.println("You need some Practice maboi.");
        }
    }
    
}
