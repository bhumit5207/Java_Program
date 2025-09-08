package Prectice;

public class StringComparison {
    public static void main(String[] args) {
        // String (Immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s); // Hello (unchanged)

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb); // Hello World

        // StringBuffer (Mutable + Thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf); // Hello World
    }
}

