import javax.swing.*;

public class ArthurDinizQ1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number: "));

        if(inputNumber > 0){
            JOptionPane.showMessageDialog(null, "Is positive!");
        } else if (inputNumber < 0) {
            JOptionPane.showMessageDialog(null, "Is negative!");
        } else {
            JOptionPane.showMessageDialog(null, "Is null!");
        }
    }
}