import javax.swing.*;
import java.lang.Math;

public class ArthurDinizQ5 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog (null, "hi");

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if(firstNumber > secondNumber){
            JOptionPane.showMessageDialog(null, Math.sqrt(firstNumber));
            JOptionPane.showMessageDialog(null, secondNumber * secondNumber);
        } else if (secondNumber > firstNumber) {
            JOptionPane.showMessageDialog(null, Math.sqrt(secondNumber));
            JOptionPane.showMessageDialog(null, firstNumber * firstNumber);
        }
    }
}