package Week_3.LAB03;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id;
    String name;
    int age;
    
    void setValues(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
}

public class LAB03EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int studentCount = 1;
        char choice;
        
        // Input loop for adding students
        do {
            System.out.println("Student #" + studentCount + ":");
            
            System.out.print("Id: ");
            String id = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            // Create student object and add to list
            Student student = new Student();
            student.setValues(id, name, age);
            studentList.add(student);
            
            System.out.print("Do you want to add more (y/n)?: ");
            choice = scanner.nextLine().charAt(0);
            
            studentCount++;
        } while (choice == 'y' || choice == 'Y');
        
        // Display all students in table format
        System.out.println("\n===============================================");
        System.out.println("| No | ID  | Name           | Age |");
        System.out.println("===============================================");
        
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.printf("| %-2d | %-3s | %-14s | %-3d |\n", 
                (i + 1), student.id, student.name, student.age);
        }
        
        System.out.println("===============================================");
        
        scanner.close();
    }
}
