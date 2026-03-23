package Week_3.LAB03;

public class LAB03EX05 {
    public static void main(String[] args) {
        System.out.println("add(5, 7) = " + Math.add(5, 7));
        System.out.println("subtract(5, 7) = " + Math.subtract(5, 7));
        System.out.println("multiply(5, 7) = " + Math.multiply(5, 7));
        System.out.println("divide(20, 5) = " + Math.divide(20, 5));
        System.out.println("min(5, 7) = " + Math.min(5, 7));
        System.out.println("max(5, 7) = " + Math.max(5, 7));
    }
}

class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}

