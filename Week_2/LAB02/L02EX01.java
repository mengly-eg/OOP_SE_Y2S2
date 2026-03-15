package Week_2.LAB02;
import java.util.Scanner;
public class L02EX01 {
    public static void main (String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Hello, " + name + "!");
        }
        
    }
}
