package Week_4.LAB04;
import java.util.ArrayList;
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
    public void setID(int iD) {
        ID = iD;
    }

    public void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}

public class L04EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            Student student = new Student();

            System.out.println("Student #" + (students.size() + 1) + ":");
            System.out.print("Id: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter a numeric ID: ");
                input.next();
            }
            student.setID(input.nextInt());
            input.nextLine();

            System.out.print("Name: ");
            student.setName(input.nextLine().trim());

            System.out.print("Age: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter a numeric age: ");
                input.next();
            }
            student.setAge(input.nextInt());
            input.nextLine();

            students.add(student);

            System.out.print("Do you want to add more (y/n)?: ");
            String more = input.nextLine().trim().toLowerCase();
            if (!more.equals("y")) {
                break;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("==============================");
        System.out.printf("%-4s | %-5s | %-20s | %-3s\n", "No", "ID", "Name", "Age");
        System.out.println("==============================");

        int index = 1;
        for (Student student : students) {
            System.out.printf("%-4d | %-5d | %-20s | %-3d\n", index++, student.getID(), student.getName(), student.getAge());
        }

        System.out.println("==============================");

        input.close();
    }
}
