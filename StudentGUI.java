import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Student
{
    int rollNo;
    String name;
    int mark1,mark2,mark3;
    Student(int rollNo,String name,int mark1,int mark2,int mark3)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    int getrollNo()
    {
        return rollNo;
    }
    String getName()
    {
        return name;
    }
    int getMark1()
    {
        return mark1;
    }
    int getMark2()
    {
        return mark2;
    }
    int getMark3()
    {
        return mark3;
    }
}
public class StudentGUI implements ActionListener
{
    JFrame jfrm;
    JTextField rollNoField,detailsField,marksField;
    JButton importButton,calcButton;
    JLabel rollNoLabel,detailsLabel,marksLabel;
    ArrayList<Student> students;
    StudentGUI()
    {
        jfrm = new JFrame("Student-GUI");
        rollNoLabel = new JLabel("Enter Roll-No : ");
        rollNoField = new JTextField(10);
        importButton = new JButton("Import");
        importButton.addActionListener(this);
        detailsLabel = new JLabel("Student Details : ");
        detailsField = new JTextField(30);
        detailsField.setEditable(false);
        detailsField.setEditable(false);
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);
        marksLabel = new JLabel("Total Marks");
        marksField = new JTextField(10);
        marksField.setEditable(false);
        marksField.setEditable(false);
        jfrm.add(rollNoLabel);
        jfrm.add(rollNoField);
        jfrm.add(importButton);
        jfrm.add(detailsLabel);
        jfrm.add(detailsField);
        jfrm.add(calcButton);
        jfrm.add(marksLabel);
        jfrm.add(marksField);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        readData();
    }
    public void readData()
    {
        students = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while((line=br.readLine())!=null)
            {
                if(Character.isDigit(line.charAt(0)))
                {
                    String[] fields = line.split("\\s++");
                    Student student = new Student(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));
                    students.add(student);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void displayDetails(int rollNo)
    {
        boolean found = false;
        for(Student student : students)
        {
            if(student.getrollNo()==rollNo)
            {
                detailsField.setText("Roll No : "+rollNo+"\nName : "+student.getName()+"\nMark-1 : "+student.getMark1()+"\nMark-2 : "+student.getMark2()+"\nMarks-3 : "+student.getMark3());;
                found = true;
                break;
            }
        }
        if(!found)
        {
            detailsField.setText("Student details not found !");
        }
    }
    public void displayMarks(int rollNo)
    {
        boolean found = false;
        for(Student student : students)
        {
            if(student.getrollNo()==rollNo)
            {
                int result = student.getMark1()+student.getMark2()+student.getMark3();
                marksField.setText("Total marks : "+result);
                found = true;
                break;
            }
        }
        if(!found)
        {
            marksField.setText("Student details not found !");
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==importButton)
        {
            int rollNo = Integer.parseInt(rollNoField.getText());
            displayDetails(rollNo);
        }
        else if(e.getSource()==calcButton)
        {
            int rollNo = Integer.parseInt(rollNoField.getText());
            displayMarks(rollNo);;
        }
    }
    public static void main(String[] args)
    {
        StudentGUI GUI = new StudentGUI();
    }
}