import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
class TrafficLight implements ActionListener
{
    JFrame jfrm;
    JPanel panel;
    String msg = "";
    JLabel jl;
    JTextField jtf;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;
    public TrafficLight()
    {
        jfrm = new JFrame("Traffic Light");
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        jl = new JLabel("Traffic Light");
        jtf = new JTextField(10);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jtf.setFont(new Font("Serif",Font.BOLD,20));
        jtf.setEditable(false);
        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("YELLOW");
        bg = new ButtonGroup();
        panel.add(jl);
        panel.add(jtf);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        jfrm.add(panel);
        jfrm.pack();
        jfrm.setSize(400,400);
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
        {
            msg = e.getActionCommand();
            if(msg.equals("RED"))
            {
                panel.setBackground(Color.RED);
                jtf.setBackground(Color.red);
                jtf.setText("STOP");
            }
            else if(msg.equals("GREEN"))
            {
                panel.setBackground(Color.GREEN);
                jtf.setBackground(Color.green);
                jtf.setText("GO");
            }
            else
            {
                panel.setBackground(Color.YELLOW);
                jtf.setBackground(Color.yellow);
                jtf.setText("WAIT");
            }
        }
    public static void main(String[] args)
    {
        TrafficLight trafficLight  = new TrafficLight();
    }
}