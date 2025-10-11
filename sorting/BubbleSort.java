/*
Sudip Khadka
JDK: 24
*/

package bubblesort;

public class BubbleSort {

    
    public static void main(String[] args) {
        int number[] = {8,5,2,3,6,9};
        boolean swap = true;
        int temp;
        
        while(swap == true){
            swap = false;
            for (int i=0; i<number.length - 1; i++){
                if (number[i]>number [i+1]){
                    temp = number[i+1];
                    number[i+1] = number[i];
                    number[i] = temp;
                    swap = true;
                }
            }
        }
        for(int i=0; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
    
}
