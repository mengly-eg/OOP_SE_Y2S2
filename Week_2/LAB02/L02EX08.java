package Week_2.LAB02; 
import java.util.Scanner;

class L02EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Input value of A: ");
            int a = scanner.nextInt();
            System.out.print("Input value of B: ");
            int b = scanner.nextInt();
            System.out.print("Input value of C: ");
            int c = scanner.nextInt();
            System.out.print("Input value of D: ");
            int d = scanner.nextInt();
            System.out.print("Input value of E: ");
            int e = scanner.nextInt();

            int min = a;
            if (b < min) min = b;
            if (c < min) min = c;
            if (d < min) min = d;
            if (e < min) min = e;

            System.out.println();
            System.out.println("The smallest number among A, B, C, D, and E is: " + min);
        scanner.close();
    }
}