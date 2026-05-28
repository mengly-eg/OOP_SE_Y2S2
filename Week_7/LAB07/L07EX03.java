package Week_7.LAB07;

import java.util.Scanner;

abstract class textRandomizer {
    abstract char randomizeACharacter();
    abstract String randomizeAString(int length);
    abstract String[] randomizeStrings(int lengthm, int amount);
}

class randomizer extends textRandomizer {
    @Override
    char randomizeACharacter() {
        return (char) (Math.random() * 26 + 'a');
    }

    @Override
    String randomizeAString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomizeACharacter());
        }
        return sb.toString();
    }

    @Override
    String[] randomizeStrings(int length, int amount) {
        String[] strings = new String[amount];
        for (int i = 0; i < amount; i++) {
            strings[i] = randomizeAString(length);
        }
        return strings;
    }
}

public class L07EX03 {
    public static void main(String[] args) {
        randomizer rand = new randomizer();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("===== Text Randomizer =====");
                System.out.print("1. A Character\n2. A String\n3. Unique Strings\n4. Quit\nEnter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> System.out.println(rand.randomizeACharacter());
                    case 2 -> {
                        System.out.print("Enter the length of the string: ");
                        int length = scanner.nextInt();
                        System.out.println(rand.randomizeAString(length));
                    }
                    case 3 -> {
                        System.out.print("Enter the length of the strings: ");
                        int strLength = scanner.nextInt();
                        System.out.print("Enter the amount of strings to generate: ");
                        int amount = scanner.nextInt();
                        String[] strings = rand.randomizeStrings(strLength, amount);
                        for (String s : strings) {
                            System.out.println(s);
                        }
                    }
                    case 4 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
