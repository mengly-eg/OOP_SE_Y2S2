package Week_5.LAB05;

import java.util.ArrayList;
import java.util.Scanner;

class Shape {
    
}

class Line extends Shape {
    double length;
    
    public Line(double length) {
        this.length = length;
    }
    
    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    @Override
    public String toString() {
        return "length: " + length;
    }
}

class Rectangle extends Shape {
    double width, height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void draw() {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}

class Triangle extends Shape {
    double base, height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public void draw() {
        int baseInt = (int) base;
        int heightInt = (int) height;
        
        for (int h = 1; h <= heightInt; h++) {
            int spaces = (baseInt - h) / 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int w = 0; w < h; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString() {
        return "Base: " + base + ", Height: " + height;
    }
}

public class L05EX03 {
    public static void main (String args[]) {
        ArrayList<Line> lines = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();
        
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("==== Menu ====\n1. View all lines\n2. View all rectangles\n3. View all triangles\n4. Add a new shape\n5. Quit\nChoose an opt: ");
                int option = input.nextInt();
                
                switch (option) {
                    case 1 -> {
                        System.out.println("\n==== List all lines ====");
                        if (lines.isEmpty()) {
                            System.out.println("No lines available.");
                        } else {
                            for (int i = 0; i < lines.size(); i++) {
                                System.out.println((i + 1) + ". " + lines.get(i));
                                lines.get(i).draw();
                            }
                        }
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("\n==== List all rectangles ====");
                        if (rectangles.isEmpty()) {
                            System.out.println("No rectangles available.");
                        } else {
                            for (int i = 0; i < rectangles.size(); i++) {
                                System.out.println((i + 1) + ". " + rectangles.get(i));
                                rectangles.get(i).draw();
                            }
                        }
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.println("\n==== List all triangles ====");
                        if (triangles.isEmpty()) {
                            System.out.println("No triangles available.");
                        } else {
                            for (int i = 0; i < triangles.size(); i++) {
                                System.out.println((i + 1) + ". " + triangles.get(i));
                                triangles.get(i).draw();
                            }
                        }
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("\n==== Add new shape ====");
                        System.out.print("Select a shape:\n1. Line\n2. Rectangle\n3. Triangle\nChoose an opt: ");
                        int shapeOption = input.nextInt();
                        
                        switch (shapeOption) {
                            case 1 -> {
                                System.out.print("Input length: ");
                                double length = input.nextDouble();
                                lines.add(new Line(length));
                                System.out.println();
                            }
                            case 2 -> {
                                System.out.print("Input width: ");
                                double width = input.nextDouble();
                                System.out.print("Input height: ");
                                double height = input.nextDouble();
                                rectangles.add(new Rectangle(width, height));
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.print("Input base: ");
                                double base = input.nextDouble();
                                System.out.print("Input height: ");
                                double height = input.nextDouble();
                                triangles.add(new Triangle(base, height));
                                System.out.println();
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                }
            }
        }
    }
}
