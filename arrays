/*
SUDIP KHADKA
Soda sales tracker: total, highest, and lowest sold
JDK VERSION: 24
*/
package sodasort;

import java.util.Scanner;
public class SodaSort {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sodaNum ;
        int totalSold = 0;
        
        
        
        do{
        System.out.println("How many types of soda would you like to enter: ");
        sodaNum = input.nextInt();
        }while(sodaNum<0);
        input.nextLine();
        
        String [] sodaType= new String[sodaNum];
        
        
        for(int i=0;i<sodaNum;i++){
            System.out.println("Enter the name of soda type "+ (i+1) + ":");
            sodaType[i] = input.nextLine();
        }
        
        int [] soldSoda = new int[sodaNum];
        
        for(int i=0; i<sodaNum; i++){
            do{
            System.out.print("Enter the name of "+ sodaType[i] + " bottles sold:  ");
            soldSoda[i] = input.nextInt();
            }while(soldSoda[i]<0);   
            totalSold += soldSoda[i];
        }
        
        //Compares number of sold soda from array and assigns the highes to variable int highNum
        //Also while assigning the highest sold Soda name to variable String highSoda
        
        int highNum = soldSoda[0];
        String highSoda = sodaType[0];
        int lowNum = soldSoda[0];
        String lowSoda = sodaType[0];
        
        for(int i=1; i<sodaNum; i++){
            if(soldSoda[i]>highNum){
                highNum = soldSoda[i];
                highSoda = sodaType[i];
            }
            
            if(soldSoda[i]<lowNum){
                lowNum = soldSoda[i];
                lowSoda = sodaType[i];
            }
        }
        
        System.out.println("Total Sold: " + totalSold);
        System.out.println("Highest Sold: " + highSoda);
        System.out.println("Lowest Sold: " + lowSoda);
        
    }
}
