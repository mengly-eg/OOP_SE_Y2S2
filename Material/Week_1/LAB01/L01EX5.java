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

        //Part D
        System.out.println("\n\n" + "=".repeat(15) + "  Part D  " + "=".repeat(15));
        String textD1 = "Hi Students!";
        String textD2 = "Teacher";
        String textD3 = "Student";
        if (textD1.equals(textD2)) {
            System.out.println("Text1 is equal to Text2: " + true);
        } else {
            System.out.println("Text1 is equal to Text2: " + false);
        }

        if (textD1.equals(textD3)) {
            System.out.println("Text1 is equal to Text3: " + true);
        } else {
            System.out.println("Text1 is equal to Text3: " + false);
        }

        //Part E
        System.out.println("\n\n" + "=".repeat(15) + "  Part E  " + "=".repeat(15));
        if (textD1.contains(textD2)) {
            System.out.println("Text1 contains Text2: " + true);
        } else {
            System.out.println("Text1 contains Text2: " + false);
        }

        if (textD1.contains(textD3)) {
            System.out.println("Text1 contains Text3: " + true);
        } else {
            System.out.println("Text1 contains Text3: " + false);
        }
    }
}
