package Week_2.LAB02;

class Student {
    int sid;
    String name;
    char gender;
    int age;
    double score;
}

public class L02EX11 {
    public static void main(String[] args) {
        // Create 3 Student objects with values assigned
        Student stu1 = new Student();
        stu1.sid = 111;
        stu1.name = "Tola";
        stu1.gender = 'M';
        stu1.age = 20;
        stu1.score = 85;

        Student stu2 = new Student();
        stu2.sid = 222;
        stu2.name = "Komoneak";
        stu2.gender = 'M';
        stu2.age = 15;
        stu2.score = 68;

        Student stu3 = new Student();
        stu3.sid = 333;
        stu3.name = "Nakura";
        stu3.gender = 'F';
        stu3.age = 19;
        stu3.score = 90;

        // Create an array and put all objects into it
        Student[] stuArr = new Student[3];
        stuArr[0] = stu1;
        stuArr[1] = stu2;
        stuArr[2] = stu3;

        // Display all students from the array
        System.out.println("=== Student List ===");
        System.out.printf("%-5s | %-10s | %-3s | %-3s | %-5s\n", "ID", "Name", "G", "Age", "Score");
        System.out.println("================================================");
        
        for (int i = 0; i < stuArr.length; i++) {
            System.out.printf("%-5d | %-10s | %-3c | %-3d | %-5.1f\n", 
                stuArr[i].sid, 
                stuArr[i].name, 
                stuArr[i].gender, 
                stuArr[i].age, 
                stuArr[i].score);
        }
    }
}
