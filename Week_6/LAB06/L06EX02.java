package Week_6.LAB06;

import java.util.Scanner;
class MyMath {

    //Add method
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    //Mulyipluy method
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static int multiply(int[] numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }

    //Min method
    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //Max method
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Average method
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static double average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}


public class L06EX02 {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {

                System.out.println("===== Menu =====");
                System.out.println("1. Sum of 2 numbers");
                System.out.println("2. Sum of 3 numbers");
                System.out.println("3. Sum of many numbers");
                System.out.println("4. Multiply of 2 numbers");
                System.out.println("5. Multiply of 3 numbers");
                System.out.println("6. Multiply of many numbers");
                System.out.println("7. Min of 2 numbers");
                System.out.println("8. Min of 3 numbers");
                System.out.println("9. Min of many numbers");
                System.out.println("10. Max of 2 numbers");
                System.out.println("11. Max of 3 numbers");
                System.out.println("12. Max of many numbers");
                System.out.println("13. Average of 2 numbers");
                System.out.println("14. Average of 3 numbers");
                System.out.println("15. Average of many numbers");
                System.out.println("16. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();


                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        int sum = MyMath.add(num1, num2);
                        System.out.println("Sum: " + sum);
                    }
                    case 2 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        System.out.println("Enter 3rd numbers:");
                        int num3 = sc.nextInt();
                        int sum = MyMath.add(num1, num2, num3);
                        System.out.println("Sum: " + sum);
                    }
                    case 3 -> {
                        System.out.println("Enter the number of elements:");
                        int n = sc.nextInt();
                        int[] numbers = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            numbers[i] = sc.nextInt();
                        }
                        int sum = MyMath.add(numbers);
                        System.out.println("Sum: " + sum);
                    }
                    case 4 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        int product = MyMath.multiply(num1, num2);
                        System.out.println("Product: " + product);
                    }
                    case 5 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        System.out.println("Enter 3rd numbers:");
                        int num3 = sc.nextInt();
                        int product = MyMath.multiply(num1, num2, num3);
                        System.out.println("Product: " + product);
                    }
                    case 6 -> {
                        System.out.println("Enter the number of elements:");
                        int n = sc.nextInt();
                        int[] numbers = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            numbers[i] = sc.nextInt();
                        }
                        int product = MyMath.multiply(numbers);
                        System.out.println("Product: " + product);
                    }
                    case 7 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        int min = MyMath.min(num1, num2);
                        System.out.println("Minimum: " + min);
                    }
                    case 8 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        System.out.println("Enter 3rd numbers:");
                        int num3 = sc.nextInt();
                        int min = MyMath.min(num1, num2, num3);
                        System.out.println("Minimum: " + min);
                    }
                    case 9 -> {
                        System.out.println("Enter the number of elements:");
                        int n = sc.nextInt();
                        int[] numbers = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            numbers[i] = sc.nextInt();
                        }
                        int min = MyMath.min(numbers);
                        System.out.println("Minimum: " + min);
                    }
                    case 10 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        int max = MyMath.max(num1, num2);
                        System.out.println("Maximum: " + max);
                    }
                    case 11 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        System.out.println("Enter 3rd numbers:");
                        int num3 = sc.nextInt();
                        int max = MyMath.max(num1, num2, num3);
                        System.out.println("Maximum: " + max);
                    }
                    case 12 -> {
                        System.out.println("Enter the number of elements:");
                        int n = sc.nextInt();
                        int[] numbers = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            numbers[i] = sc.nextInt();
                        }
                        int max = MyMath.max(numbers);
                        System.out.println("Maximum: " + max);
                    }
                    case 13 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        double average = MyMath.average(num1, num2);
                        System.out.println("Average: " + average);
                    }
                    case 14 -> {
                        System.out.println("Enter 1st numbers:");
                        int num1 = sc.nextInt();
                        System.out.println("Enter 2nd numbers:");
                        int num2 = sc.nextInt();
                        System.out.println("Enter 3rd numbers:");
                        int num3 = sc.nextInt();
                        double average = MyMath.average(num1, num2, num3);
                        System.out.println("Average: " + average);
                    }
                    case 15 -> {
                        System.out.println("Enter the number of elements:");
                        int n = sc.nextInt();
                        int[] numbers = new int[n];
                        System.out.println("Enter the elements:");
                        for (int i = 0; i < n; i++) {
                            numbers[i] = sc.nextInt();
                        }
                        double average = MyMath.average(numbers);
                        System.out.println("Average: " + average);
                    }
                    case 16 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> {
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        }
    }
}