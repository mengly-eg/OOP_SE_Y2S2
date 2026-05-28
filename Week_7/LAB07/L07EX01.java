package Week_7.LAB07;

import java.util.Scanner;

abstract class ShapeArea {
    abstract double calculateRectangleArea(double width, double height);
    abstract double calculateCircleArea(double radius);
    abstract double calculateTriangleArea(double a, double b, double c);
    abstract double calculateTriangleArea(double base, double height);
    abstract double calculateSemicircleArea(double radius);
    abstract double calculateSectorArea(double radius, double angle);
}
    
class GeometryArea extends ShapeArea {
    @Override
    double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    @Override
    double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    @Override
    double calculateSemicircleArea(double radius) {
        return 0.5 * Math.PI * radius * radius;
    }

    @Override
    double calculateSectorArea(double radius, double angle) {
        return 0.5 * Math.PI * radius * radius * (angle / 360);
    }
}
public class L07EX01 {
    public static void main (String[] args) {
        GeometryArea geometry = new GeometryArea();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n========== Menu ==========");
                System.out.println("1. Rectangle Area\n2. Circle Area\n3. Triangle Area (using 3 sides)\n4. Triangle Area (using base and height)\n5. Semicircle Area\n6. Sector Area\n7. Quit\nEnter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        System.out.println("\nRectangle Area: " + geometry.calculateRectangleArea(width, height));
                        break;
                    case 2:
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        System.out.println("\nCircle Area: " + geometry.calculateCircleArea(radius));
                        break;
                    case 3:
                        System.out.print("Enter side a: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter side b: ");
                        double b = scanner.nextDouble();
                        System.out.print("Enter side c: ");
                        double c = scanner.nextDouble();
                        System.out.println("\nTriangle Area: " + geometry.calculateTriangleArea(a, b, c));
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double triangleHeight = scanner.nextDouble();
                        System.out.println("\nTriangle Area: " + geometry.calculateTriangleArea(base, triangleHeight));
                        break;
                    case 5:
                        System.out.print("Enter radius: ");
                        double semicircleRadius = scanner.nextDouble();
                        System.out.println("\nSemicircle Area: " + geometry.calculateSemicircleArea(semicircleRadius));
                        break;
                    case 6:
                        System.out.print("Enter radius: ");
                        double sectorRadius = scanner.nextDouble();
                        System.out.print("Enter angle (in degrees): ");
                        double angle = scanner.nextDouble();
                        System.out.println("\nSector Area: " + geometry.calculateSectorArea(sectorRadius, angle));
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
