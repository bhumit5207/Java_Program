package Prectice;

public class LoopExample {
	public static void main(String[] args) {

        // 1. FOR LOOP
        System.out.println("=== FOR LOOP ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // 2. WHILE LOOP
        System.out.println("\n=== WHILE LOOP ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // 3. DO-WHILE LOOP
        System.out.println("\n=== DO-WHILE LOOP ===");
        int k = 1;
        do {
            System.out.println("Do-While Iteration: " + k);
            k++;
        } while (k <= 5);

        // 4. FOR-EACH LOOP (Enhanced For Loop)
        System.out.println("\n=== FOR-EACH LOOP ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // 5. BREAK & CONTINUE
        System.out.println("\n=== BREAK & CONTINUE ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break;  // exits loop completely
            }
            if (i % 2 == 0) {
                System.out.println("Continue at i = " + i);
                continue;  // skips rest of this iteration
            }
            System.out.println("Value of i: " + i);
        }

        // 6. NESTED LOOPS
        System.out.println("\n=== NESTED LOOPS (Multiplication Table) ===");
        for (int row = 1; row <= 3; row++) {          // outer loop
            for (int col = 1; col <= 3; col++) {      // inner loop
                System.out.print((row * col) + "\t");
            }
            System.out.println();  // new line after each row
        }
    }
}

