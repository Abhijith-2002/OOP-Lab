import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
abstract class Compartment
{
    abstract String notice();
}
class FirstClass extends Compartment
{
    int ticketVacancy;
    int ticketCount;
    FirstClass(int ticketVacancy)
    {
        this.ticketVacancy = ticketVacancy;
    }
    void bookTicket(int ticketCount)
    {
        if(ticketVacancy>0)
        {
            if(ticketCount<=ticketVacancy)
            {
                ticketVacancy-=ticketCount;
            }
        }
    }
    void cancelTicket(int ticketCount)
    {
        ticketVacancy+=ticketCount;
    }
    String notice()
    {
        return "First-Class Vacancy : "+ticketVacancy;
    }
}
class General extends Compartment
{
    int ticketVacancy;
    int ticketCount;
    General(int ticketVacancy)
    {
        this.ticketVacancy = ticketVacancy;
    }
    void bookTicket(int ticketCount)
    {
        if(ticketVacancy>0)
        {
            if(ticketCount<=ticketVacancy)
            {
                ticketVacancy-=ticketCount;
            }
        }
    }
    void cancelTicket(int ticketCount)
    {
        ticketVacancy+=ticketCount;
    }
    String notice()
    {
        return "General Vacancy : "+ticketVacancy;
    }
}
class CompartmentGUI implements ActionListener
{
    JFrame jfrm;
    JTextField firstClassTF;
    JTextField generalTF;
    JLabel notice;
    JButton b,c;
    FirstClass firstClass;
    General general;
    CompartmentGUI()
    {
        jfrm = new JFrame("Ticket-Booking");
        firstClassTF = new JTextField(10);
        generalTF = new JTextField(10);
        notice = new JLabel("Notice");
        b = new JButton("Book-Ticket");
        b.addActionListener(this);
        c = new JButton("Cancel-Ticket");
        c.addActionListener(this);
        jfrm.add(firstClassTF);
        jfrm.add(generalTF);
        jfrm.add(notice);
        jfrm.add(b);
        jfrm.add(c);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstClass = new FirstClass(50);
        general = new General(100);
        notice.setText(firstClass.notice()+" | "+general.notice());
    }
    public void actionPerformed(ActionEvent e)
    {
        int firstClassticketCount = Integer.parseInt(firstClassTF.getText());
        int generalTicketCount = Integer.parseInt(generalTF.getText());
        if(e.getSource()==b)
        {
            if(firstClassticketCount>0)
            {
                firstClass.bookTicket(firstClassticketCount);
            }
            if(generalTicketCount>0)
            {
                general.bookTicket(generalTicketCount);
            }
            notice.setText(firstClass.notice()+" | "+general.notice());
        }
        else if(e.getSource()==c)
        {
            if(firstClassticketCount>0)
            {
                firstClass.cancelTicket(firstClassticketCount);
            }
            if(generalTicketCount>0)
            {
                general.cancelTicket(generalTicketCount);
            }
            notice.setText(firstClass.notice()+" | "+general.notice());
        }
    }
    public static void main(String[] args)
    {
        CompartmentGUI GUI = new CompartmentGUI();
    }
}