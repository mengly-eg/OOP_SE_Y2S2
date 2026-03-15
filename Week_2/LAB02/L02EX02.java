package Week_2.LAB02;
import java.util.Scanner;

public class L02EX02 {
    public static void main(String args[]) {
        System.out.println("=".repeat(20) + "> Currency Converter Program! <" + "=".repeat(20));
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the exchange rate of 1 USD in Riel: ");
            double exchangeRate = input.nextDouble();

            System.out.print("Enter the amount in Riel: ");
            double riel = input.nextDouble();
            double usd = riel / exchangeRate;
            System.out.println(riel + " Riel = " + usd + " USD");
        }
    }
}
