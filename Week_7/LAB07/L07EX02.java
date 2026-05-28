package Week_7.LAB07;

import java.util.Scanner;

abstract class NumberRandomizer {
    abstract int randomizeInBetween(int min, int max);
    abstract int[] randomizeUniqueInBetween(int min, int max, int amount); 
}

class Generator extends NumberRandomizer {
    @Override
    int randomizeInBetween(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    @Override
    int[] randomizeUniqueInBetween(int min, int max, int amount) {
        if (amount > (max - min + 1)) {
            throw new IllegalArgumentException("Amount cannot be greater than the range of unique numbers.");
        }
        
        int[] uniqueNumbers = new int[amount];
        boolean[] usedNumbers = new boolean[max - min + 1];
        
        for (int i = 0; i < amount; i++) {
            int num;
            do {
                num = randomizeInBetween(min, max);
            } while (usedNumbers[num - min]);
            
            uniqueNumbers[i] = num;
            usedNumbers[num - min] = true;
        }
        
        return uniqueNumbers;
    }
}
public class L07EX02 {
    public static void main (String[] args) {
        Generator generator = new Generator();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("===== Number Randoizer =====");
                System.out.print("1. Randomize in between\n2. Randomize unique in between\n3. Quit\nChoose: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter minimum value: ");
                        int min = sc.nextInt();
                        System.out.print("Enter maximum value: ");
                        int max = sc.nextInt();
                        int randomNum = generator.randomizeInBetween(min, max);
                        System.out.println("Randomized number: " + randomNum);
                    }
                    case 2 -> {
                        System.out.print("Enter minimum value: ");
                        int min = sc.nextInt();
                        System.out.print("Enter maximum value: ");
                        int max = sc.nextInt();
                        System.out.print("Enter amount of unique numbers to generate: ");
                        int amount = sc.nextInt();
                        int[] uniqueNumbers = generator.randomizeUniqueInBetween(min, max, amount);
                        System.out.println("Randomized unique numbers:");
                        for (int num : uniqueNumbers) {
                            System.out.println(num);
                        }
                    }
                    case 3 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
