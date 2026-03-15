package Material.Week_1.LAB01;

public class L01EX5 {
    public static void main(String args[]) {
        //Part A
        System.out.println("=".repeat(15) + "  Part A  " + "=".repeat(15));
        String textA = "I Love My Home Country";
        System.out.println("text length is : " + textA.length() + "\n\n");


        //Part B
        System.out.println("=".repeat(15) + "  Part B  " + "=".repeat(15));
        String textB = "I Love My Little Country";
        System.out.println("Result: " + textB.substring(7) + "\n\n");


        //Part C
        System.out.println("=".repeat(15) + "  Part C  " + "=".repeat(15));
        String textC = "Hi Students!";
        System.out.println("'i' is at index: " + textC.indexOf('i'));
        System.out.println("'u' is at index: " + textC.indexOf('u'));
        System.out.println("'e' is at index: " + textC.indexOf('e'));
    }
}
