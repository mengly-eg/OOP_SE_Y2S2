package Week_3.LAB03;



public class LAB03EX06 {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + Math.factor(5));
        System.out.println("Surface of rectangle with sides 4 and 5: " + Math.rectangleSurface(4, 5));
        System.out.println("Surface of circle with radius 3: " + Math.circleSurface(3));
        System.out.println("Maximum of (1, 2, 3, 4, 5): " + Math.max(1, 2, 3, 4, 5));
        System.out.println("Minimum of (1, 2, 3, 4, 5): " + Math.min(1, 2, 3, 4, 5));
    }
}

class Math {
    public static int factor (int a) {
        if (a <= 1) {
            return 1;
        }
        return a * factor(a - 1);
    }
    public static int rectangleSurface (int a, int b) {
        return a * b;
    }

    public static double circleSurface (double a) {
        return (3.14 * a * a);
    }
    public static double max (int a, int b, int c, int d, int e) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }
    public static int min (int a, int b, int c, int d, int e) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }
        return min;
    }
}