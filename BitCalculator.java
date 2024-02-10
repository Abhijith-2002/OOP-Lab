import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BitCalculator implements ActionListener
{
    JFrame jfrm;
    JRadioButton r1,r2;
    JTextField jtf;
    JButton b;
    BitCalculator()
    {
        jfrm = new JFrame();
        jfrm.setLayout(new FlowLayout());
        r1 = new JRadioButton("bit-1");
        r2 = new JRadioButton("bit-2");
        jtf = new JTextField(10);
        jtf.setEditable(false);
        b = new JButton("reset");
        r1.addActionListener(this);
        r2.addActionListener(this);
        b.addActionListener(this);
        jfrm.add(jtf);
        jfrm.add(r1);
        jfrm.add(r2);
        jfrm.add(b);
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==r1 || e.getSource()==r2)
        {
            if(r1.isSelected() && r2.isSelected())
            {
                jtf.setText("3");
            }
            else if(r1.isSelected())
            {
                jtf.setText("2");
            }
            else if(r2.isSelected())
            {
                jtf.setText("1");
            }
            else
            {
                jtf.setText("0");
            }
        }
        else if(e.getSource()==b)
        {
            r1.setSelected(false);
            r2.setSelected(false);
            jtf.setText("");
        }
    }
    public static void main(String[] args)
    {
        BitCalculator bc = new BitCalculator();
    }
}