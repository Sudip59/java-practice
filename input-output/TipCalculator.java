import java.text.NumberFormat;
import javax.swing.JOptionPane;

/*
Computing TIP CALCULATOR 
written by SUDIP KHADKA on 8/31/2025
JDK version
 */
public class TipCalculator {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the Total Bill amount:");
        double bill = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Enter the tip percentage as a decimal"
                + ("Example: 10% would be 0.2"));
        double percentage = Double.parseDouble(input);
        
        double tipAmount=bill*percentage;
        
         NumberFormat dollars = NumberFormat.getCurrencyInstance();
        
        JOptionPane.showMessageDialog(null,"Bill amount" 
                + dollars.format(bill) 
        + "\nTip Percentage" + dollars.format(percentage) 
                + "\nTip:"+ dollars.format(tipAmount));
        
       
        
       
    }
    
}
