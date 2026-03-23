package Week_3.LAB03;
import java.lang.Math;
import java.util.Scanner;

public class LAB03EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program for calculating root of a quadratic equation");
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation roots are complex.");
        }
        input.close();

    }
}
