/*
SUDIP KHADKA
JDK VERSION: 24
CHAPTER 8 ASSIGNMENT 
*/
package monthcreator;

public class MonthCreator {

    
    public static void main(String[] args) {
       Month obj1 = new Month(1);
        System.out.println(obj1.toString());
       
       Month obj2 = new Month(1);
        System.out.println(obj2.toString());
        
       boolean a = obj1.equals(obj2);
       
       if(a == true){
           System.out.println(obj1.getMonthName() + " equals " + obj2.getMonthName() );
       }
       else
            System.out.println(obj1.getMonthName() + " is not equal to " + obj2.getMonthName());
    }
    
}

