import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class FileGUI implements ActionListener
{
    JFrame jfrm;
    JTextField jtf;
    JButton readButton;
    FileGUI()
    {
        jfrm = new JFrame("FileGUI");
        jtf = new JTextField(30);
        readButton = new JButton("Read");
        readButton.addActionListener(this);
        jfrm.add(jtf);
        jfrm.add(readButton);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String str = jtf.getText();
        StringTokenizer stringToken = new StringTokenizer(str," ");
        String header = "=========================================\nSl.No\tToken\n=========================================\n";
        int index = 111;
        try
        {
            FileWriter writer = new FileWriter("college-data.txt");
            writer.write(header);
            while(stringToken.hasMoreTokens())
            {
                writer.write(index+"\t"+stringToken.nextToken()+"\n");
                index++;
            }
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args)
    {
        FileGUI GUI = new FileGUI();
    }
}