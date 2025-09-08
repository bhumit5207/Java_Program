package Prectice;

public class VariablesAndDataTypes {

 public static void main(String[] args) {

     // 1. Primitive Data Types
     byte byteVar = 100;                 // 8-bit signed integer
     short shortVar = 30000;             // 16-bit signed integer
     int intVar = 100000;                // 32-bit signed integer
     long longVar = 10000000000L;        // 64-bit signed integer (add 'L' at the end)

     float floatVar = 3.14f;             // 32-bit floating point (add 'f' at the end)
     double doubleVar = 3.14159265359;   // 64-bit floating point

     char charVar = 'A';                 // 16-bit Unicode character
     boolean booleanVar = true;          // Boolean type (true or false)

     // 2. Non-Primitive Data Type (Reference type)
     String stringVar = "Hello, Java!";  // String is a class, not primitive

     // 3. Printing variables
     System.out.println("=== Primitive Data Types ===");
     System.out.println("byte: " + byteVar);
     System.out.println("short: " + shortVar);
     System.out.println("int: " + intVar);
     System.out.println("long: " + longVar);
     System.out.println("float: " + floatVar);
     System.out.println("double: " + doubleVar);
     System.out.println("char: " + charVar);
     System.out.println("boolean: " + booleanVar);

     System.out.println("\n=== Non-Primitive Data Type ===");
     System.out.println("String: " + stringVar);

     // 4. Example usage
     int age = 25;
     double salary = 55000.50;
     boolean isEmployed = true;

     System.out.println("\n=== Example Usage ===");
     System.out.println("Age: " + age);
     System.out.println("Salary: " + salary);
     System.out.println("Employed: " + isEmployed);
 }
}

