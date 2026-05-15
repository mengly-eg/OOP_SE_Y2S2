package Week_5.LAB05;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



class MyDate {
    void getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.print("Current date time is: " + dateFormat.format(calendar.getTime()));
    }

    void calculatteDaysBtwDates() throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.print("First date (dd-MM-yyyy): ");
        Date d1 = dateFormat.parse(input.nextLine());
        System.out.print("Second date (dd-MM-yyyy): ");
        Date d2 = dateFormat.parse(input.nextLine());
        long milliseconds1 = d1.getTime();
        long milliseconds2 = d2.getTime();
        long diff = Math.abs(milliseconds2 - milliseconds1);
        long diffDays = diff / (24 * 60 * 60 * 1000);
        System.out.print("Difference between two dates is: " + diffDays + " days");
        input.close();
    }

    void findDay() throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print("Input a date (dd-MM-yyyy): ");
        Date d = dateFormat.parse(input.nextLine());
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayFormat.format(d);
        System.out.print("The day of the week is: " + dayOfWeek);
        input.close();

    }
}

public class L05EX01 {
    public static void main (String args[]) throws ParseException {
        try (Scanner input = new Scanner(System.in)) {
            MyDate myDate = new MyDate();
            System.out.print(" === Menu ===\n1. Display current date and time\n2. Calculate days between two dates\n3. Find the day of the week\n4. Quit\nChoose an option: ");
            int option = input.nextInt();
            switch (option) {
                case 1 -> myDate.getCurrentDate();
                case 2 -> myDate.calculatteDaysBtwDates();
                case 3 -> myDate.findDay();
                case 4 -> System.out.print("Exiting...");
            }

        }
    }
}
