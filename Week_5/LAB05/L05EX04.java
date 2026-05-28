package Week_5.LAB05;
import java.io.IOException;
import java.util.Scanner;

public class L05EX04 {
    public static void main(String args[]) throws IOException {
        try (Scanner input = new Scanner(System.in)) {
            while (true) { 
                System.out.print("=== Menu ===\n1. View my note\n2. Edit\n3. Quit\nEnter an option: ");
                int option = input.nextInt();
                input.nextLine(); // Consume the newline character
                switch (option) {
                    case 1 -> {
                        System.out.println("=== Edit following note ===\n" + "*".repeat(40));
                        System.out.println("*".repeat(40));
                    }
                    case 2 -> {}
                    case 3 -> System.exit(0);
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
