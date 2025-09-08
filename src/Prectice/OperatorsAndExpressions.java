package Prectice;

public class OperatorsAndExpressions {

    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        // Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        c += 5;   // c = c + 5
        System.out.println("c += 5 → " + c);
        c *= 2;   // c = c * 2
        System.out.println("c *= 2 → " + c);

        // Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));  // pre-increment
        System.out.println("d++ = " + (d++));  // post-increment
        System.out.println("After d++ → d = " + d);
        System.out.println("--d = " + (--d));  // pre-decrement

        // Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);

        // Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        int m = 6, n = 3; // 6 = 110, 3 = 011 (in binary)
        System.out.println("m & n = " + (m & n));  // AND
        System.out.println("m | n = " + (m | n));  // OR
        System.out.println("m ^ n = " + (m ^ n));  // XOR
        System.out.println("~m = " + (~m));        // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift

        // Expression Example
        System.out.println("\n=== Expression Example ===");
        int result = (a + b) * (c - d);
        System.out.println("Expression (a + b) * (c - d) = " + result);
    }
}

