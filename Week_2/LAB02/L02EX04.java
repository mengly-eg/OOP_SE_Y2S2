package Week_2.LAB02;
import java.util.Scanner;

public class L02EX04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int seconds = input.nextInt();
        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = seconds % 60;
        System.out.print("Time corresponding to " + seconds + " seconds is: " + hour + ":" + minute + ":" + second);
        input.close();
    }
}
