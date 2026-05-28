package Week_6.LAB06;

import javax.swing.*;

public class L06EX05 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Simple Calculator");
        titleLabel.setBounds(200, 20, 100, 25);
        frame.add(titleLabel);

        JLabel ALabel = new JLabel("A:");
        ALabel.setBounds(50, 60, 20, 25);
        frame.add(ALabel);

        JTextField AField = new JTextField();
        AField.setBounds(80, 60, 100, 25);
        frame.add(AField);

        JLabel BLabel = new JLabel("B:");
        BLabel.setBounds(50, 100, 20, 25);
        frame.add(BLabel);

        JTextField BField = new JTextField();
        BField.setBounds(80, 100, 100, 25);
        frame.add(BField);



        JButton plusButton = new JButton("A+B");
        plusButton.setBounds(80, 140, 100, 30);
        frame.add(plusButton);
        JLabel plusResultLabel = new JLabel("A+B =");
        plusResultLabel.setBounds(100, 180, 200, 25);
        frame.add(plusResultLabel);
        plusButton.addActionListener(e -> {
            try {
                double A = Double.parseDouble(AField.getText());
                double B = Double.parseDouble(BField.getText());
                double result = A + B;
                plusResultLabel.setText("A+B = " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers for A and B.");
            }
        });

        JButton minusButton = new JButton("A-B");   
        minusButton.setBounds(80, 220, 100, 30);
        frame.add(minusButton);
        JLabel minusResultLabel = new JLabel("A-B =");
        minusResultLabel.setBounds(100, 260, 200, 25);
        frame.add(minusResultLabel);
        minusButton.addActionListener(e -> {
            try {
                double A = Double.parseDouble(AField.getText());
                double B = Double.parseDouble(BField.getText());
                double result = A - B;
                minusResultLabel.setText("A-B = " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers for A and B.");
            }
        });

        JButton multiplyButton = new JButton("A*B");
        multiplyButton.setBounds(80, 300, 100, 30);
        frame.add(multiplyButton);
        JLabel multiplyResultLabel = new JLabel("A*B =");
        multiplyResultLabel.setBounds(100, 340, 200, 25);
        frame.add(multiplyResultLabel);
        multiplyButton.addActionListener(e -> {
            try {
                double A = Double.parseDouble(AField.getText());
                double B = Double.parseDouble(BField.getText());
                double result = A * B;
                multiplyResultLabel.setText("A*B = " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers for A and B.");
            }
        });

        JButton divideButton = new JButton("A/B");
        divideButton.setBounds(80, 380, 100, 30);
        frame.add(divideButton);
        JLabel divideResultLabel = new JLabel("A/B =");
        divideResultLabel.setBounds(100, 420, 200, 25);
        frame.add(divideResultLabel);
        divideButton.addActionListener(e -> {
            try {
                double A = Double.parseDouble(AField.getText());
                double B = Double.parseDouble(BField.getText());
                if (B != 0) {
                    double result = A / B;
                    divideResultLabel.setText("A/B = " + result);
                } else {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers for A and B.");
            }
        });
    }
}
