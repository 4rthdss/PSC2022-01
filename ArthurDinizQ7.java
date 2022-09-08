import javax.swing.*;

public class ArthurDinizQ7 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hi");

        double userSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input your salary: "));
        double borrowRequest = Double.parseDouble(JOptionPane.showInputDialog(null, "How much do you want to borrow"));

        if (userSalary * 0.30 >= borrowRequest){
            JOptionPane.showMessageDialog(null, "Ok, your request was approved!");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, your request was declined. Because your salary is less than 30% to the borrow.");
        }
    }
}