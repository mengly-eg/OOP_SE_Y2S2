package Week_6.LAB06;

import java.util.HashSet;
import java.util.Scanner;

abstract class AbstractMath {
    int reverseNumber(int num) {
        return 0;
    };
    int roundedNumber(double num) {
        return 0;
    };
    int countDistinct(int[] values) {
        return 0;
    };
    int decimalToBinary(int decimal) {
        return 0;
    };
}

class Math extends AbstractMath {
    @Override
    int reverseNumber(int num) {
        int reversed = 0;
        int number = (num);
        
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        return (num < 0) ? -reversed : reversed;
    }
    
    @Override
    int roundedNumber(double num) {
        if (num >= 0) {
            return (int) (num + 0.5);
        } else {
            return (int) (num - 0.5);
        }
    }
    
    @Override
    int countDistinct(int[] values) {
        HashSet<Integer> distinctSet = new HashSet<>();
        for (int value : values) {
            distinctSet.add(value);
        }
        return distinctSet.size();
    }
    
    @Override
    int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        
        int binary = 0;
        int placeValue = 1;
        
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * placeValue;
            placeValue *= 10;
            decimal /= 2;
        }
        
        return binary;
    }
}

public class L06EX01 {
    public static void main(String[] args) {
        Math math = new Math();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            while (running) {
                System.out.println("\n==== Menu ===");
                System.out.println("1. Reverse a number");
                System.out.println("2. Rounded number");
                System.out.println("3. Count distinct number");
                System.out.println("4. Decimal to Binary");
                System.out.println("5. Quit");
                System.out.print("Choose an opt: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.println("::: Reverse a number :::");
                        System.out.print("Input number: ");
                        int numToReverse = scanner.nextInt();
                        int reversed = math.reverseNumber(numToReverse);
                        System.out.println("Output is: " + reversed);
                    }
                        
                    case 2 -> {
                        System.out.println("::: Rounded number :::");
                        System.out.print("Input number: ");
                        double numToRound = scanner.nextDouble();
                        int rounded = math.roundedNumber(numToRound);
                        System.out.println("Output is: " + rounded);
                    }
                        
                    case 3 -> {
                        System.out.println("::: Count distinct number :::");
                        System.out.print("Enter array size: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.print("Enter array elements: ");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        int distinctCount = math.countDistinct(arr);
                        System.out.println("Output is: " + distinctCount);
                    }
                        
                    case 4 -> {
                        System.out.println("::: Decimal to Binary :::");
                        System.out.print("Input decimal: ");
                        int decimal = scanner.nextInt();
                        int binary = math.decimalToBinary(decimal);
                        System.out.println("Output is: " + binary);
                    }
                        
                    case 5 -> {
                        System.out.println("Goodbye!");
                        running = false;
                    }
                        
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
            
            scanner.close();
        }
    }
}
