import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener
{
    JFrame jfrm = new JFrame("Calculator");
    JTextField jtf = new JTextField();
    String s0,s1,s2;
    JPanel buttonsPanel;
    Calculator()
    {
        s0 = s1 = s2 = "";
        jtf.setEditable(false);
        jtf.setFont(new Font(Font.SANS_SERIF,Font.BOLD,36));
        jfrm.getContentPane().setLayout(new GridLayout(0,1));
        buttonsPanel = new JPanel(new GridLayout(4,4));
        JButton[] buttons = new JButton[16];
        buttons[0] = new JButton("0");
        buttons[1] = new JButton("1");
        buttons[2] = new JButton("2");
        buttons[3] = new JButton("3");
        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("7");
        buttons[8] = new JButton("8");
        buttons[9] = new JButton("9");
        buttons[10] = new JButton("+");
        buttons[11] = new JButton("-");
        buttons[12] = new JButton("/");
        buttons[13] = new JButton("*");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("C");

        jfrm.add(jtf);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
            buttonsPanel.add(buttons[i]);
        }
        jfrm.add(buttonsPanel);
        jfrm.pack();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(Character.isDigit(s.charAt(0)) || s.charAt(0)=='.')
        {
            if(!s1.equals(""))
            {
                s2 = s2 + s;
            }
            else
            {
                s0 = s0 + s;
            }
            jtf.setText(s0 + s1 + s2);
        }
        else if(s.charAt(0)=='C')
        {
            s0 = s1 = s2 = "";
            jtf.setText(s0 + s1 + s2);
        }
        else if(s.charAt(0)=='=')
        {
            double result;
            if(s1.equals("+"))
            {
                result = Double.parseDouble(s0) + Double.parseDouble(s2);
            }
            else if(s1.equals("-"))
            {
                result = Double.parseDouble(s0) - Double.parseDouble(s2);
            }
            else if(s1.equals("/"))
            {
                result = Double.parseDouble(s0) / Double.parseDouble(s2);
            }
            else
            {
                result = Double.parseDouble(s0) * Double.parseDouble(s2);
            }
            jtf.setText(s0 + s1 + s2 + "=" + result);
            s0 = Double.toString(result);
            s1 = s2 = "";
        }
        else
        {
            s1 = s;
        }
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
    }
}
