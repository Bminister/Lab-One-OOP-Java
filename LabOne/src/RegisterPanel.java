
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private Register register; // a register object to run the logic
    private JPanel inputPanel; //a panel to hold the JTextField for the user to enter an amount
    private JTextField input; // a place for the user to enter the amount
    private PursePanel changePanel; // a panel to display the change
RegisterPanel() {
    register = new Register();
    this.setPreferredSize(new Dimension(100, 100));

    JPanel inputPanel = new JPanel();
    input = new JTextField();
    inputPanel.add(new JLabel("Enter Amount: "));
    inputPanel.add(input);


}




    //InputListener (class, implements ActionListener)   // a listener for changes to the input
    //actionPerformed(ActionEvent e): void   // what happens when input changes

}
