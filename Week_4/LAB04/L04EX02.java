package Week_4.LAB04;

import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private int ID;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public void display() {
        System.out.println("====================");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("====================");
    }
}




public class L04EX02 {
    public static void main (String[] args) {
        Student[] students = new Student[100];
        int count =0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("=== Menu ===\n1. View all students\n2. Add a new student\n3. Delete a student\n4. Quit\nChoose an option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        for (Student student : students) {
                            if (student != null) {
                                student.display();
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Adding a new student...");
                        if (count < 100) {
                            students[count] = new Student();
                            System.out.print("Enter student name: ");
                            sc.nextLine(); // Consume newline
                            String name = sc.nextLine();
                            System.out.print("Enter student age: ");
                            int age = sc.nextInt();
                            System.out.print("Enter student ID: ");
                            int id = sc.nextInt();
                            students[count].setName(name);
                            students[count].setAge(age);
                            students[count].setID(id);
                            count++;
                        } else {
                            System.out.println("Cannot add more students. Array is full.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Deleting a student...");
                    }
                    case 4 -> {
                        System.out.println("Exiting the program...");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }
}
