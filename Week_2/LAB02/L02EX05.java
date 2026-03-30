package Week_2.LAB02;
import java.util.Scanner;

public class L02EX05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("PRogram for calculating eqaution 1/x = 1/y + 1/z to find value of x\n");
        System.out.print("Input value of y: ");
        int y = input.nextInt();
        System.out.print("Input value of z: ");
        int z = input.nextInt();
        double x = 1 / ((1.0 / y) + (1.0 / z));
        System.out.print("Value of x is: " + x);
        input.close();
    }
} 