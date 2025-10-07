/*
SUDIP KHADKA
CHAPTER 6 ASSIGNMENT
JDK VERSION: 24
*/

package customercreator;

import java.util.Scanner;
public class CustomerCreator {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer obj = new Customer();
        String name;
        int score;
        
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        obj.setName(name);
        
        System.out.println("Enter your credit score:");
        score = scanner.nextInt();
        System.out.println("\n");
        obj.setCreditScore(score);
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Credit Score: " + obj.getCreditScore());
        System.out.println("Credit Rating: " + obj.getCreditRating(score));
    }
    
}


