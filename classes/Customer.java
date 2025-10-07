
package customercreator;

public class Customer {
    String name = null;
    int creditScore =  300;
    
    public Customer(){
        
    }
    
    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setCreditScore(int creditScore){
        if(creditScore >300){
            this.creditScore = creditScore;
        }else{
            this.creditScore = 300;
        }
    }
    public int getCreditScore(){
        return this.creditScore;
    }
    
    public String getCreditRating(int score){
        
        if(score >=630 && score <=689){
            return "Fair";
        }else if(score >=690 && score <=719){
            return "Good";
        }else if(score >=720 && score <=850){
            return "Excellent";
        }else{
            return "Bad";
                    
        }
        
}
}