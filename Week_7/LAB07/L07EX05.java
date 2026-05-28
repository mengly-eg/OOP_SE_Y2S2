package Week_7.LAB07;
import java.awt.*;
import javax.swing.*;

class Student {
    private String name;
    private int age;
    private String studentID;

    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }
}

public class L07EX05 {
    public static void main(String[] args) {
        JFrame f = new JFrame("L07EX05");

        JLabel title = new JLabel("Student Management System", SwingConstants.CENTER);
        title.setBounds(0, 0, 1240, 100);
        title.setFont(new Font("Arial", Font.BOLD, 36));

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0, 100, 1240, 200);
        inputPanel.setLayout(null);
        
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(150, 55, 100, 30);
        JTextField firstNameField = new JTextField(20);
        firstNameField.setBounds(150, 90, 150, 30);
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(350, 55, 100, 30);
        JTextField lastNameField = new JTextField(20);
        lastNameField.setBounds(350, 90, 150, 30);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(550, 55, 75, 30);
        JTextField ageField = new JTextField(5);
        ageField.setBounds(550, 90, 100, 30);
        JLabel majorLabel = new JLabel("Major:");
        majorLabel.setBounds(700, 55, 100, 30);
        JTextField majorField = new JTextField(15);
        majorField.setBounds(700, 90, 150, 30);

        JLabel[] labels = {firstNameLabel, lastNameLabel, ageLabel, majorLabel};
        for (JLabel label : labels) {
            label.setFont(new Font("Arial", Font.BOLD, 16));
        }

        JTextField[] textFields = {firstNameField, lastNameField, ageField, majorField};
        for (JTextField textField : textFields) {
            textField.setFont(new Font("Arial", Font.PLAIN, 18));
            textField.setBackground(Color.WHITE);
        }

        JButton addButton = new JButton("Add Student");
        addButton.setFont(new Font("Arial", Font.BOLD, 18));
        addButton.setBackground(new Color(0, 123, 255));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBounds(900, 70, 200, 60);

        JPanel tablePanel = new JPanel();
        tablePanel.setBounds(0, 300, 1240, 475);
        tablePanel.setBackground(Color.LIGHT_GRAY);

        JTable studentTable = new JTable();
        studentTable.setFont(new Font("Arial", Font.PLAIN, 16));
        

        inputPanel.add(firstNameLabel);
        inputPanel.add(firstNameField);
        inputPanel.add(lastNameLabel);
        inputPanel.add(lastNameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);
        inputPanel.add(majorLabel);
        inputPanel.add(majorField);
        inputPanel.add(addButton);
        
        f.add(title, BorderLayout.NORTH);
        f.add(inputPanel, BorderLayout.CENTER);
        f.add(tablePanel, BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(new BorderLayout());
        f.setSize(1240, 800);
        f.setVisible(true);
        f.setLocationRelativeTo(null);

    }
}
