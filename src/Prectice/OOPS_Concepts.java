package Prectice;

public class OOPS_Concepts {
	String color;   // Attribute 1
    int year;       // Attribute 2

    // Method to set car details
    void setDetails(String carColor, int carYear) {
        color = carColor;
        year = carYear;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car color: " + color);
        System.out.println("Manufacturing Year: " + year);
        System.out.println();
    }

    // Method to check if the car is new (year > 2020)
    boolean isNewCar() {
        return year > 2020;
    }

    // Main method to create and use Car objects
    public static void main(String[] args) {
        // Create first Car object
    	OOPS_Concepts car1 = new OOPS_Concepts();
        car1.setDetails("Red", 2023);
        car1.displayDetails();
        System.out.println("Is car1 new? " + car1.isNewCar());
        System.out.println();

        // Create second Car object
        OOPS_Concepts car2 = new OOPS_Concepts();
        car2.setDetails("Blue", 2018);
        car2.displayDetails();
        System.out.println("Is car2 new? " + car2.isNewCar());
        System.out.println();
    }
}
