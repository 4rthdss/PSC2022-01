import javax.swing.*;

public class ArthurDinizQ2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if(inputNumber % 2 == 0){
            JOptionPane.showMessageDialog(null, "Is odd!");
        } else {
            JOptionPane.showMessageDialog(null, "Is even!");
        }
    }
}