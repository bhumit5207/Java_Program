package Prectice;

public class ConditionalExample {
    public static void main(String[] args) {
        
        // Example 1: Simple if statement
        int number = 10;
        if (number > 0) {
            System.out.println("Example 1: Number is positive.");
        }

        // Example 2: if-else statement
        int age = 17;
        if (age >= 18) {
            System.out.println("Example 2: You can vote.");
        } else {
            System.out.println("Example 2: You cannot vote.");
        }

        // Example 3: if-else-if ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Example 3: Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Example 3: Grade: A");
        } else if (marks >= 50) {
            System.out.println("Example 3: Grade: B");
        } else {
            System.out.println("Example 3: Grade: Fail");
        }

        // Example 4: Nested if statement
        boolean hasVoterID = false;
        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("Example 4: You are eligible to vote.");
            } else {
                System.out.println("Example 4: You need a Voter ID to vote.");
            }
        } else {
            System.out.println("Example 4: You are not eligible to vote.");
        }

        // Example 5: switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Example 5: Monday");
                break;
            case 2:
                System.out.println("Example 5: Tuesday");
                break;
            case 3:
                System.out.println("Example 5: Wednesday");
                break;
            case 4:
                System.out.println("Example 5: Thursday");
                break;
            case 5:
                System.out.println("Example 5: Friday");
                break;
            case 6:
                System.out.println("Example 5: Saturday");
                break;
            case 7:
                System.out.println("Example 5: Sunday");
                break;
            default:
                System.out.println("Example 5: Invalid day");
        }

        // Example 6: Ternary operator
        int num = -5;
        String result = (num >= 0) ? "Positive number" : "Negative number";
        System.out.println("Example 6: " + result);
    }
}

