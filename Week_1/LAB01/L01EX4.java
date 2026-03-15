package Material.Week_1.LAB01;

public class L01EX4 {
    public static void main(String args[]) {
        //Part A
        System.out.println("=".repeat(23) + "  Part A  " + "=".repeat(23));
        System.out.print("     |");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d|", i);
        }
        System.out.println();
        System.err.println("-".repeat((11*5)+1));


        for (int i = 1; i <= 5; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d|", i * j);
            }
            System.out.println();
        }

        System.out.print("\n\n\n");

        //Part B
        System.out.println("=".repeat(23) + "  Part B  " + "=".repeat(23));
        String format = "| %-15s | %-8s | %-20s | %-4s |%n";
        String line = "+-----------------+----------+----------------------+------+%n";

        System.out.printf(line);
        System.out.printf(format, "Country", "Name", "Profession", "Age");
        System.out.printf(line);

        System.out.printf(format, "Germany", "Michael", "Computer Engineer", "19");
        System.out.printf(line);
        System.out.printf(format, "England", "Robert", "Artist", "34");
        System.out.printf(line);
        System.out.printf(format, "United Kingdom", "Julia", "Designer", "42");
        System.out.printf(line);
        System.out.printf(format, "United States", "Jo", "Actor", "21");
        System.out.printf(line);
    }
}
