package Week_2.LAB02;
import java.util.Scanner;

public class L02EX10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int option;
        int valueA, valueB;
        int result;
        String continueChoice;

        while (true) {
            // Display menu
            System.out.println("=== Math Menu ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quit");
            System.out.println();
            System.out.print("Please choose an option: ");

            // Input validation for option
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please choose an option again.\n");
                System.out.println("=== Math Menu ===");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (x)");
                System.out.println("4. Division (/)");
                System.out.println("5. Quit");
                System.out.println();
                System.out.print("Please choose an option: ");
                input.next();
            }
            option = input.nextInt();
            input.nextLine();

            // Check for quit option
            if (option == 5) {
                System.out.println("Thank you for using Math Menu. Goodbye!");
                break;
            }

            // Check for valid option
            if (option < 1 || option > 4) {
                System.out.println("Please choose an option again.");
                System.out.println();
                continue;
            }

            // Input values for calculation
            System.out.print("Please input value A: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please input value A: ");
                input.next();
            }
            valueA = input.nextInt();
            input.nextLine();

            System.out.print("Please input value B: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please input value B: ");
                input.next();
            }
            valueB = input.nextInt();
            input.nextLine();

            // Perform calculation
            switch (option) {
                case 1:
                    result = valueA + valueB;
                    System.out.println("Answer of A + B = " + result);
                    break;
                case 2:
                    result = valueA - valueB;
                    System.out.println("Answer of A - B = " + result);
                    break;
                case 3:
                    result = valueA * valueB;
                    System.out.println("Answer of A x B = " + result);
                    break;
                case 4:
                    if (valueB == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                    } else {
                        result = valueA / valueB;
                        System.out.println("Answer of A / B = " + result);
                    }
                    break;
            }

            // Ask if user wants to continue
            System.out.println();
            System.out.print("Do you want to continue? If no go to Menu.\nInput your answer (y/n): ");
            continueChoice = input.nextLine().trim().toLowerCase();

            if (!continueChoice.equals("y")) {
                System.out.println();
            }
        }

        input.close();
    }
}
