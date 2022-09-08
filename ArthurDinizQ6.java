import javax.swing.*;

public class ArthurDinizQ6 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if (firstNumber > secondNumber){
            JOptionPane.showMessageDialog(null, secondNumber + ", " + firstNumber + ".");
        } else if (secondNumber > firstNumber){
            JOptionPane.showMessageDialog(null, firstNumber + ", " + secondNumber + ".");
        }
    }
}