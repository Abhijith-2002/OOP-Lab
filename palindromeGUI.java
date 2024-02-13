import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class PalindromeGUI implements ActionListener
{
    JFrame jfrm;
    JTextField inputField,outputField;
    JButton checkButton;
    JLabel inputLabel,outputLabel;
    PalindromeGUI()
    {
        jfrm = new JFrame("PalindromeGUI");
        inputLabel = new JLabel("Enter the string : ");
        inputField = new JTextField(16);
        checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        outputLabel = new JLabel("Result : ");
        outputField = new JTextField(16);
        outputField.setEditable(false);
        jfrm.add(inputLabel);
        jfrm.add(inputField);
        jfrm.add(checkButton);
        jfrm.add(outputLabel);
        jfrm.add(outputField);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        outputField.setText("");
        StringBuilder str = new StringBuilder(inputField.getText());
        if(str.toString().equals(str.reverse().toString()))
        {
            outputField.setText("Palindrome");
        }
        else
        {
            outputField.setText("Not Palindrome");
        }
    }
    public static void main(String[] args)
    {
        PalindromeGUI GUI = new PalindromeGUI();
    }
}