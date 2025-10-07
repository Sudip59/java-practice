/*
SUDIP KHADKA
9/20/2025
METHOD GAME ASSIGNMENT
JDK 24
*/
package methodsgame;
import java.util.Scanner;
import java.util.Random;
public class MethodsGame {

    public static void main(String[] args) {
        Random meow = new Random();
        Scanner input = new Scanner(System.in);
       String play="";
        do{
        int num = meow.nextInt(10)+1;
        boolean truth = switchPlanet(num);
        
        System.out.println("True/False?");
        String user = input.nextLine();
        //converting string to boolean
        //Because it helps with user's different answer like (true,TrUe,TRUE)
        boolean userAnswer = Boolean.parseBoolean(user); 
       
        
        compare(truth,userAnswer);
        
            System.out.print("Would you like to play again?(yes/no):");
            play = input.nextLine();
        }while(play.equalsIgnoreCase("yes"));
    }
    
    public static boolean switchPlanet(int x){
        switch(x){
            case 1: 
                System.out.println("Earth is the densest planet.");
                return true;    
            case 2: System.out.println("Jupiter is the largest planet.");
                return true;
            case 3: System.out.println("Mercury has no atmosphere.");
                return true;
            case 4: System.out.println("Venus rotates oppposite most planets.");
                return true;
            case 5: System.out.println("Saturn has large icy rings.");
                return true;
            case 6: System.out.println("Mars has rings like saturn.");
                return false;
            case 7: System.out.println("Neptune is the closest planet to the sun.");
                return false;
            case 8: System.out.println("Mercury is the largest planet.");
                return false;
            case 9: System.out.println("Venus has a breathable atmosphere like Earth.");
                return false;
            case 10:System.out.println("Jupiter has only one moon like Earth.");
                return false;
            default:
                System.out.println("Invalid number: please try again.");
                return false;
        }
    }
    
    public static void compare(boolean fact, Boolean user){
        if(fact==user){
            System.out.println("Correct.");
        }else{
            System.out.println("Incorrect.");
        }
}
}

