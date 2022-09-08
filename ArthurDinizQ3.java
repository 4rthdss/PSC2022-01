import javax.swing.*;
import java.lang.Math;

public class ArthurDinizQ3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if(inputNumber > 0){
            JOptionPane.showMessageDialog(null, Math.sqrt(inputNumber));
        } else {
            JOptionPane.showMessageDialog(null, inputNumber * inputNumber);
        }
    }
}