package Week_2.LAB02;
import java.util.Scanner;

public class L02EX06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check whether it is a prime number: ");
        int number = input.nextInt();
        if (number % 2 == 0 && number != 2) {
            System.out.print(number + " is not a prime number.");
        }
            else
        {
            System.out.print(number + " is a prime number.");
        }
        input.close();
    }
}
