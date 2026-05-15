package Week_5.LAB05;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    Scanner input = new Scanner(System.in);
    String name, gender;
    int age, id;

    // Contrusctor
    public Student(String name, String gender, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public void newStudent() {
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("ID: ");
        id = input.nextInt();
        input.nextLine(); // Consume the newline
    }

}

public class L05EX02 {
    public static void main(String args[]) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print(
                        "=== Menu ===\n1. Add new students\n2. Delete multiple students\n3. Quit\nChoose an option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1 -> {
                        while (true) {
                            Student student = new Student("", "", 0, 0); // Create a student object with default values
                                                                         // in new Constructor
                            System.out.print("Student #" + (students.size() + 1) + "\n");
                            student.newStudent(); // Call method
                            students.add(student); // Add the student to the list
                            System.out.print("Add another student? (Y/N): ");
                            String response = input.next();
                            if (response.equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                    }
                    case 2 -> {
                        System.out.print("=".repeat(56) + "\n");
                        System.out.printf("%-6s %-8s %-20s %-10s %-6s | \n", "| No.", "| ID", "| Name", "| Gender",
                                "| Age");
                        System.out.print("=".repeat(56) + "\n");
                        for (Student s : students) {
                            System.out.printf("%-6s | %-6d | %-18s | %-8s | %-4d | \n",
                                    "| " + (students.indexOf(s) + 1), s.id, s.name, s.gender, s.age);
                            System.out.print("=".repeat(56) + "\n");
                        }
                        System.out.print("===== DELETION =====\n");
                        ArrayList<String> deletedStudents = new ArrayList<>();
                        while (true) { 
                            System.out.print("Input Student ID to delete: ");
                            int idToDelete = input.nextInt();
                            
                            boolean found = false;
                            for (int i = 0; i < students.size(); i++) {
                                if (students.get(i).id == idToDelete) {
                                    deletedStudents.add(students.get(i).name);
                                    students.remove(i);
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("Student with ID " + idToDelete + " not found.");
                            }

                            System.out.print("Delete another student? (Y/N): ");
                            String response = input.next();
                            if (response.equalsIgnoreCase("N")) {
                                System.out.println("\n===== DELETION SUMMARY =====");
                                for (String name : deletedStudents) {
                                    System.out.println("Deleted student: " + name);
                                }
                                break;
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("Exiting...");
                        break;
                    }
                }
            }
        }
    }
}
