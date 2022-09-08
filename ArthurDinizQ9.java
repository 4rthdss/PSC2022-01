import javax.swing.*;

public class ArthurDinizQ9 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Input one rhombus diagonal value: "));
        double q = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the other rhombus diagonal value: "));

        double area = (p * q) / 2;
        JOptionPane.showMessageDialog(null, "The rhombus area is: " + area);
    }
}