/*
*Sudip Khadka 8/31/2025
*This program will break change into correct coins
JDK Version 24
  */
package moneychanger;

public class MoneyChanger {

  
    public static void main(String[] args) {
        
      int cents = 183;
      int centsLeft;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;
      
        
      dollars=cents/100;
      centsLeft=cents%100;
      quarters=centsLeft/25;
      centsLeft=centsLeft%25;
      dimes=centsLeft/10;
      centsLeft=centsLeft%10;
      nickels=centsLeft/5;
      centsLeft=centsLeft%5;
      pennies=centsLeft;
      
      System.out.println("Total Cents:"+cents
      + "\nDollars:"+dollars
      +"\nQuarters:"+quarters
      +"\nDimes:"+dimes
      +"\nNickels:"+nickels
      +"\nPennies:"+pennies);
    }
    
}
