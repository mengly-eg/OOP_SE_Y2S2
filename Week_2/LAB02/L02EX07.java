package Week_2.LAB02;

import java.util.Scanner;

public class L02EX07 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a sentence: ");
            String sentence = scanner.nextLine();
            
            int vowels = 0;
            int consonants = 0;
            int spaces = 0;
            
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (ch == ' ') {
                    spaces++;
                } else if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            
            System.out.println("Count of vowel is: " + vowels);
            System.out.println("Count of consonant is: " + consonants);
            System.out.println("Count of space is: " + spaces);
        }
    }
}
