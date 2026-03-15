package Week_2.LAB02;
import java.util.Scanner;

public class L02EX03 {
    public static void main(String args[]) {
        System.out.println("=".repeat(5) + "COVID-19 SCREEN HEALTH" + "=".repeat(5));
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Q1. Feeling fever and/or having chills? (Y/N): ");
            String answer1 = input.nextLine();
            System.out.print("Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another health condition? (Y/N): ");
            String answer2 = input.nextLine();
            System.out.print("Q3. A new cough that is not due to another health confition? (Y/N): ");
            String answer3 = input.nextLine();
            System.out.print("Q4. New chills that are not due to another health condition? (Y/N): ");
            String answer4 = input.nextLine();
            System.out.print("Q5. A new sore thoat that is not due to another health condition? (Y/N): ");
            String answer5 = input.nextLine();
            System.out.print("Q6. Loss of taste or smell? (Y/N): ");
            String answer6 = input.nextLine();
            System.out.print("Q7. Have you had a positive test for the virus that cause COVID-19 disease within the past 10 days? (Y/N): ");
            String answer7 = input.nextLine();
            System.out.print("Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19? (Y/N): ");
            String answer8 = input.nextLine();


            System.out.println("\n" + "=".repeat(45));
            System.out.printf("| %-20s| %-20s| ", "Question", "Answer");
            System.out.println("\n" + "=".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q1", answer1);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q2", answer2);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q3", answer3);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q4", answer4);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q5", answer5);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q6", answer6);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q7", answer7);
            System.out.println("-".repeat(45));
            System.out.printf("| %-20s| %-20s| %n", "Q8", answer8);
            System.out.println("-".repeat(45));

        }
    }
}

