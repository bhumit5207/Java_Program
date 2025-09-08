package Prectice;

// Demonstration of 'this' and 'static' keywords in Java

// ---------- Using 'this' keyword ----------
class Student {
    String name;
    int age;

    // Constructor using 'this' to distinguish between instance and local variables
    Student(String name, int age) {
        this.name = name;  // 'this.name' refers to instance variable
        this.age = age;
    }

    // Method using 'this' to call another method
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display() {
        this.printDetails(); // calling current class method using 'this'
    }

    // Method chaining example (returning current object)
    Student updateName(String newName) {
        this.name = newName;
        return this;
    }
}

// ---------- Using 'static' keyword ----------
class Employee {
    // Static variable → shared across all objects
    static String company = "OpenAI";

    String name; // Instance variable
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Static method → can change static variable
    static void changeCompany(String newCompany) {
        company = newCompany;
    }

    // Instance method → prints details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Company: " + company);
    }
}

// ---------- Main Class ----------
public class ThisAndstaticKeyword {
    public static void main(String[] args) {

        // ===== Using 'this' keyword =====
        System.out.println("=== this keyword Demo ===");
        Student s1 = new Student("Bhumit", 22);
        s1.display();

        // Method chaining with 'this'
        s1.updateName("Amit").display();

        // ===== Using 'static' keyword =====
        System.out.println("\n=== static keyword Demo ===");
        Employee e1 = new Employee("Raj", 101);
        Employee e2 = new Employee("Kunal", 102);

        e1.display();
        e2.display();

        // Changing static variable → affects all objects
        Employee.changeCompany("Google");

        e1.display();
        e2.display();
    }
}

