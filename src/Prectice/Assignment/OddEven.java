package Prectice.Assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create Scanner object
        System.out.print("Enter any number: ");
        int number = scanner.nextInt(); // read input
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close(); // close scanner
    }
}
