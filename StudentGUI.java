import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Student {
    String rollNo;
    String name;
    int mark1;
    int mark2;
    int mark3;

    Student(String rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    String getrollNo() {
        return rollNo;
    }

    String getname() {
        return name;
    }

    int getmarks1() {
        return mark1;
    }

    int getmarks2() {
        return mark2;
    }

    int getmarks3() {
        return mark3;
    }
}

public class StudentGUI implements ActionListener {
    JFrame jfrm;
    JTextField rollNoField;
    JLabel detailsField,marksField;
    JButton b1, b2;
    ArrayList<Student> students;

    StudentGUI() {
        jfrm = new JFrame();
        jfrm.setSize(800,800);
        rollNoField = new JTextField(16);
        detailsField = new JLabel("student-details");
        marksField = new JLabel("total-marks");
        detailsField.setPreferredSize(new Dimension(200,200));
        marksField.setPreferredSize(new Dimension(200,200));
        detailsField.setBorder(new LineBorder(Color.BLACK));
        marksField.setBorder(new LineBorder(Color.BLACK));
        b1 = new JButton("import data");
        b2 = new JButton("calculate");
        b1.addActionListener(this);
        b2.addActionListener(this);
        jfrm.add(rollNoField);
        jfrm.add(detailsField);
        jfrm.add(marksField);
        jfrm.add(b1);
        jfrm.add(b2);
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            readData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readData() throws FileNotFoundException, IOException {
        students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(Character.isDigit(line.charAt(0)))
                {
                    String[] fields = line.split("\\s+");
                    Student student = new Student(fields[0], fields[1], Integer.parseInt(fields[2]),
                    Integer.parseInt(fields[3]), Integer.parseInt(fields[4]));
                    students.add(student);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void displayDetails(String rollNo) {
        boolean found = false;
        for (Student student : students) {
            if (student.getrollNo().equals(rollNo)) {
                String msg = new String("Roll. No : " + rollNo + "\n" + "Name : " + student.getname() + "\n"
                        + "Marks1 : " + student.getmarks1() + "\n" + "Marks2 : " + student.getmarks2() + "\n"
                        + "Marks3 : " + student.getmarks3() + "\n");
                detailsField.setText("<html>" + msg.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
                found = true;
                break;
            }
        }
        if (!found) {
            marksField.setText("Student details not found!");
        }
    }

    public void displayMarks(String rollNo) {
        boolean found = false;
        for (Student student : students) {
            if (student.getrollNo().equals(rollNo)) {
                int totalMarks = student.getmarks1() + student.getmarks2() + student.getmarks3();
                String msg = new String("Total Marks : " + totalMarks);
                marksField.setText(msg);
                found = true;
                break;
            }
        }
        if (!found) {
            marksField.setText("Student details not found!");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String rollNo = rollNoField.getText();
            displayDetails(rollNo);
        } else if (e.getSource() == b2) {
            String rollNo = rollNoField.getText();
            displayMarks(rollNo);
        }
    }
    public static void main(String[] args) {
        StudentGUI GUI = new StudentGUI();
    }
}
