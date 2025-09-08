package Prectice;

class ArrayExamples {
    public static void main(String[] args) {
        
        // SINGLE DIMENSIONAL ARRAY
        System.out.println("=== Single Dimensional Array Example ===");

        // Step 1: Declare and create array of size 5
        int[] numbers = new int[5];

        // Step 2: Initialize values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Step 3: Access and print using loop
        System.out.println("Elements of 1D Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Another way: Declare + Initialize in one line
        int[] marks = {90, 85, 70, 95, 88};
        System.out.println("\nMarks Array Elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }


        // TWO DIMENSIONAL ARRAY
        System.out.println("\n=== Two Dimensional Array Example ===");

        // Step 1: Declare and create 3x3 matrix
        int[][] matrix = new int[3][3];

        // Step 2: Initialize values
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }

        // Step 3: Print matrix
        System.out.println("Matrix Elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // Another way: Declare + Initialize directly
        int[][] numbers2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nDirectly Initialized 2D Array:");
        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = 0; j < numbers2D[i].length; j++) {
                System.out.print(numbers2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}

