package Material.Week_1.LAB01;

class Employee {
    String name, profession, gender;
    int age, salary;
}

class Car {
    String brand, model;
    int year, price, mileage;

}

class BankAccount {
    String accountName, accountNumber;
    double deposit, withdrawal, balance;
}

class Video {
    String title, director;
    int duration, releaseYear, rating;
}

public class L01EX6 {
    public static void main(String args[]) {

        Employee employee1 = new Employee();
        Car car1 = new Car();

        employee1.name = "Mengly";
        employee1.profession = "Software Engineer";
        employee1.gender = "Male";
        employee1.age = 30;
        employee1.salary = 80000;

        car1.brand = "Mercedes-Benz";
        car1.model = "SLK 55";
        car1.year = 2018;
        car1.price = 55000;
        car1.mileage = 15000;
    }
}
