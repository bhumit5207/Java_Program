package Prectice;

public class Methods_Constructors {
    // Attributes (fields)
    private String make;
    private String model;
    private int year;

    // No-argument constructor (default constructor)
    public Methods_Constructors() {
        this("Unknown", "Unknown", 0); // Delegate to parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Methods_Constructors(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Manufacture year: " + year);
    }

    // Method to update the year of the car
    public void updateYear(int newYear) {
        if (newYear > 1885 && newYear <= 2025) {  // Basic validation for reasonable car year
            year = newYear;
            System.out.println("Year updated to: " + year);
        } else {
            System.out.println("Invalid year entered, update failed.");
        }
    }

    // Method to calculate car age (assuming current year 2025)
    public int getCarAge() {
        if (year == 0) {
            System.out.println("Car year not set.");
            return -1;
        }
        return 2025 - year;
    }

    public static void main(String[] args) {
        // Object created using default constructor
        Methods_Constructors car1 = new Methods_Constructors();
        car1.displayInfo();
        car1.updateYear(2015);
        int age1 = car1.getCarAge();
        if (age1 != -1) {
            System.out.println("Car age: " + age1 + " years");
        }

        System.out.println("----");

        // Object created using parameterized constructor
        Methods_Constructors car2 = new Methods_Constructors("Toyota", "Camry", 2018);
        car2.displayInfo();
        int age2 = car2.getCarAge();
        if (age2 != -1) {
            System.out.println("Car age: " + age2 + " years");
        }
    }
}
