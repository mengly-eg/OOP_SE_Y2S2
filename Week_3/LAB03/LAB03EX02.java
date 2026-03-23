package Week_3.LAB03;
import java.util.Scanner;

public class LAB03EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to input?");
        System.out.print("Number of inputs: ");
        int n = input.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Value #" + (i + 1) + ": ");
            numbers[i] = input.nextDouble();

        }

        //max value
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        //min value
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        //sum value
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        //average value
        double average = sum / n;

        System.out.println("The maximum value is: " + max);
        System.out.println("The average is: " + average);

        input.close();
    }
}
