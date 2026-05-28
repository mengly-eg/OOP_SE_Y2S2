package Week_6.LAB06;
import java.lang.Math;
import javax.swing.*;

public class L06EX04 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Root Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JLabel DescriptionLabel = new JLabel("Find root of quadratic equation ax^2 + bx + c = 0");
        DescriptionLabel.setBounds(25, 20, 450, 25);
        frame.add(DescriptionLabel);

        JLabel aLabel = new JLabel("a:");
        aLabel.setBounds(25, 50, 100, 25);
        frame.add(aLabel);

        JTextField aField = new JTextField();
        aField.setBounds(25, 80, 200, 25);
        frame.add(aField);

        JLabel bLabel = new JLabel("b:");
        bLabel.setBounds(25, 110, 200, 25);
        frame.add(bLabel);

        JTextField bField = new JTextField();
        bField.setBounds(25, 140, 200, 25);
        frame.add(bField);

        JLabel cLabel = new JLabel("c:");
        cLabel.setBounds(25, 170, 200, 25);
        frame.add(cLabel);

        JTextField cField = new JTextField();
        cField.setBounds(25, 200, 200, 25);
        frame.add(cField);

        JButton CalculateButton = new JButton("Calculate");
        CalculateButton.setBounds(25, 230, 100, 25);
        frame.add(CalculateButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(25, 260, 450, 25);
        frame.add(resultLabel);

        CalculateButton.addActionListener(e -> {
            try {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());

                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    resultLabel.setText(String.format("Result: X1 = %.2f and X2 = %.2f", root1, root2));
                } else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    resultLabel.setText(String.format("Result: X = %.2f", root));
                } else {
                    resultLabel.setText("Result: No real roots");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Please enter valid numbers for a, b, and c.");
            }
        });
    }
}
