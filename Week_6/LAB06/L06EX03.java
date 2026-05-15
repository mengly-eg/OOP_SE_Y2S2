package Week_6.LAB06;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class L06EX03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Character Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel titleLabel = new JLabel("Count number of Vowel, Consonant and Space");
        titleLabel.setBounds(25, 20, 450, 25);
        frame.add(titleLabel);

        JLabel textLabel = new JLabel("Text:");
        textLabel.setBounds(25, 55, 100, 25);
        frame.add(textLabel);

        JTextField textField = new JTextField();
        textField.setBounds(25, 80, 300, 25);
        frame.add(textField);

        JButton button = new JButton("Find");
        button.setBounds(25, 115, 100, 30);
        frame.add(button);

        JLabel vowelsLabel = new JLabel("Count of vowel is: 0");
        vowelsLabel.setBounds(25, 160, 300, 25);
        frame.add(vowelsLabel);

        JLabel consonantsLabel = new JLabel("Count of consonant is: 0");
        consonantsLabel.setBounds(25, 190, 300, 25);
        frame.add(consonantsLabel);

        JLabel spacesLabel = new JLabel("Count of space is: 0");
        spacesLabel.setBounds(25, 220, 300, 25);
        frame.add(spacesLabel);

        button.addActionListener((ActionEvent e) -> {
            String text = textField.getText().toLowerCase();
            int vowelCount = 0;
            int consonantCount = 0;
            int spaceCount = 0;
            
            for (char c : text.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else if (Character.isLetter(c)) {
                    consonantCount++;
                }
            }
            
            vowelsLabel.setText("Count of vowel is: " + vowelCount);
            consonantsLabel.setText("Count of consonant is: " + consonantCount);
            spacesLabel.setText("Count of space is: " + spaceCount);
        });
    }
}
