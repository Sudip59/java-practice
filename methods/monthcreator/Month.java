/*
SUDIP KHADKA
JDK VERSION: 24
CHAPTER 8 ASSIGNMENT 
*/

package monthcreator;

public class Month {
    private int monthNumber;
    String monthName[]={ "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"};
    private String season;
    
    
    public Month(int m){
        if(m<1 || m>12){
            this.monthNumber = 1;
        }
        else
            this.monthNumber = m;
    }
    
    public void setMonthNumber(int mon){
        if(mon<1 || mon>12){
            this.monthNumber = 1;
        }
        else
            this.monthNumber = mon;
    }
    
    public int getMonthNumber(){
        return this.monthNumber;
    }
    
    public String getMonthName(){
        return monthName[this.monthNumber-1];
    }
    
    public String getSeason(){
        if(this.monthNumber==1||this.monthNumber==2||this.monthNumber==12){
           this.season = "Winter"; 
        } else if(this.monthNumber==3||this.monthNumber==4||this.monthNumber==5){
            this.season = "Spring";
        } else if(this.monthNumber==6||this.monthNumber==7||this.monthNumber==8)  {
             this.season = "Summer";
                } else{
                    this.season = "Fall";
                }
        return this.season;
            }
    
    public String toString(){
        return "Month Number: " + this.monthNumber + "\n" +
                "Month Name: " + getMonthName() + "\n" +
                "Season: " + getSeason(); 
    }
    
    public boolean equals(Month bark){
        if(bark == null){
            return false;
        }
        return this.monthNumber == bark.monthNumber;
    }
}
