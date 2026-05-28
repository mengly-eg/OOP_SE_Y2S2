package Week_3.LAB03;
import java.util.ArrayList;
import java.util.Scanner;

class Strudent {
    int id;
    String name;
    int age;

    void setValues(int id, String name, int age) {
        this.id = id;
        this.name= name;
        this.age = age;
    }

    void display(int id, String name, int age) {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class LAB03EX07 {
    public static void main (String[] args) {
        ArrayList<Strudent> strudentList = new ArrayList<>();
        Strudent student = new Strudent();
        try (Scanner sc = new Scanner(System.in)) {
            int count = 1;
            int choice;
            do {
                
                System.out.println("===== Menu =====");
                System.out.println("1. Add Student");
                System.out.println("2. List Students");
                System.out.println("3. Quit");
                System.out.println("Choose an option: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Student #" + count);
                        count++;
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        System.out.print("Name: ");
                        String name = sc.next();
                        System.out.print("Age: ");
                        int age = sc.nextInt();

                        System.out.println("A student added successfully!");
                        student.setValues(id, name, age);
                        strudentList.add(student);
                    }
                    case 2 -> {
                        System.out.println("===== Student List =====");
                        for (Strudent s : strudentList) {
                            student.display(s.id, s.name, s.age);
                        }
                    }
                    case 3 -> System.out.println("Exiting the program...");
                }
            } while (choice != 3);
            sc.close();
        }
    }
}
