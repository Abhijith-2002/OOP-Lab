import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class ErrorGUI implements ActionListener
{
    JFrame jfrm;
    JTextField num1Field,num2Field,resultField,remarkField;
    JButton divideButton;
    JLabel resultLabel,remarkLabel;
    ErrorGUI()
    {
        jfrm = new JFrame("Error-Handling-GUI");
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        divideButton = new JButton("divide");
        divideButton.addActionListener(this);
        resultLabel = new JLabel("result");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        remarkLabel = new JLabel("remarks");
        remarkField = new JTextField(16);
        remarkField.setEditable(false);
        jfrm.add(num1Field);
        jfrm.add(num2Field);
        jfrm.add(divideButton);
        jfrm.add(resultLabel);
        jfrm.add(resultField);
        jfrm.add(remarkLabel);
        jfrm.add(remarkField);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.pack();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            if(num2==0)
            {
                throw new ArithmeticException("Error : Cannot divide by zero !");
            }
            else
            {
                remarkField.setText("");
                int result = num1/num2;
                resultField.setText(Integer.toString(result));
            }
        }
        catch(NumberFormatException e1)
        {
            remarkField.setText("Error : Not an integer !");
        }
        catch(ArithmeticException e2)
        {
            remarkField.setText(e2.getMessage());
        }
    }
    public static void main(String[] args)
    {
        ErrorGUI GUI = new ErrorGUI();
    }
}