/*
SUDIP KHADKA
JDK VERSION 24
DOG CREATOR ASSIGNMENT
*/
package dogcreator;


public class DogCreator {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Texxie", 25);
        Dog dog2 = new Dog("Juicy", 16);
        Dog dog3 = new Dog("Penny", 28);
        
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight() + "lbs");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Weight: " + dog2.getWeight() + "lbs");
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight() + "lbs");
        System.out.println("\n");
        
        System.out.println(dog1.compare(dog2));
        System.out.println(dog1.compare(dog3));
        System.out.println(dog2.compare(dog3));
        System.out.println("\n");
        
        dog1.setWeight(28);
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight());
        System.out.println(dog1.compare(dog3));
        
    }
    
}

// ---------------------------------------------------------------------

// I have pasted the code of Dog class below my main class as you said in the class.
// This works while the codes are separate in two files but it won't work here as class Dog should be in Dog.java

/*
SUDIP KHADKA
JDK VERSION 24
DOG CREATOR ASSIGNMENT 
*/

package dogcreator;
public class Dog {
    private String name = null;
    private double weight = 0;
    
    public Dog(String newName, double newWeight){
        setName(newName);
        setWeight(newWeight);
}
    public final void setName(String newName){
        this.name = newName;
    }
    
    public final void setWeight(double newWeight){
        if(newWeight > 0){
            this.weight = newWeight;
        }else{
            System.out.println("Weight cannot be negative or zero.");
        }
    }
    
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    
    public String compare(Dog dogCompare){
        String message = null;
        if(dogCompare.weight > this.weight){
            message = dogCompare.name + "  weighs more than "+ this.name;
        }else if(dogCompare.weight < this.weight){
            message = this.name + " weighs more than " + dogCompare.name;
        }else{
            message = this.name + " weighs equal to " + dogCompare.name;
        }
        return message;
}
}
