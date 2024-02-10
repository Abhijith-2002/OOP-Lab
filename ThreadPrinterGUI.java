import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ThreadPrinter extends Thread
{
    String msg;
    int count;
    ThreadPrinter(String msg,int count)
    {
        this.msg = msg;
        this.count = count;
    }
    synchronized public void run()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(msg);
        }
    }
}
class ThreadGenerator extends Thread
{
    String msg;
    int count;
    ThreadGenerator(String msg,int count)
    {
        this.msg = msg;
        this.count = count;
    }
    public void run()
    {
        ThreadPrinter printerThread = new ThreadPrinter(msg,count);
        printerThread.start();
    }
}
public class ThreadPrinterGUI implements ActionListener
{
    JFrame jfrm;
    JTextField jtf;
    JButton printButton;
    ThreadPrinterGUI()
    {
        jfrm = new JFrame("Thread Printer");
        jtf = new JTextField(10);
        printButton = new JButton("print");
        printButton.addActionListener(this);
        jfrm.add(jtf);
        jfrm.add(printButton);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int count = Integer.parseInt(jtf.getText());
        ThreadGenerator thread1 = new ThreadGenerator("Thrikkakkara",count);
        ThreadGenerator thread2 = new ThreadGenerator("Kochi",count);
        thread1.start();
        thread2.start();
    }
    public static void main(String[] args)
    {
        ThreadPrinterGUI GUI = new ThreadPrinterGUI();
    }
}