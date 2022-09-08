import javax.swing.*;

public class ArthurDinizQ4 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if(inputNumber % 5 == 0){
            JOptionPane.showMessageDialog(null, "Is divisible by 5!");
        } else {
            JOptionPane.showMessageDialog(null, "Isn't divisible by 5.");
        }
    }
}