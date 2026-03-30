package Week_2.LAB02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L02EX09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        int idx = 0;

        while (true) {
            System.out.print("Input value in Array at index " + idx + ": ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }
            int v = sc.nextInt();
            values.add(v);
            idx++;
            System.out.print("Do you want to add more (y/n)?: ");
            String r = sc.next().trim().toLowerCase();
            if (r.isEmpty() || r.charAt(0) != 'y') {
                break;
            }
        }

        if (values.isEmpty()) {
            System.out.println("No values entered.");
        } else {
            int max = values.get(0);
            for (int value : values) {
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("The biggest number among in Array is: " + max);
        }
        sc.close();
    }
}
