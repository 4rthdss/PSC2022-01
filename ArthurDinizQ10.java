import javax.swing.*;

public class ArthurDinizQ10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        int inchesInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a value in inches: "));
        double convertCm = inchesInput * 2.54;

        JOptionPane.showMessageDialog(null, "1 inch == 2.54 cm \n Your input: " + inchesInput + " == " + convertCm);
    }
}