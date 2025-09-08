package Prectice;

public class StringExample {
    public static void main(String[] args) {
        String str = " Java Programming ";

        System.out.println("Original String: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring(2,7): " + str.substring(2,7));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
        System.out.println("Starts with 'Ja': " + str.startsWith("Ja"));
        System.out.println("Ends with 'ing': " + str.endsWith("ing"));
        System.out.println("Replace 'a' with '@': " + str.replace('a','@'));
        System.out.println("Char at index 5: " + str.charAt(5));
        System.out.println("Index of 'P': " + str.indexOf("P"));
        System.out.println("Last Index of 'a': " + str.lastIndexOf("a"));
        System.out.println("Equals 'Java': " + str.equals("Java"));
        System.out.println("Equals Ignore Case: " + "JAVA".equalsIgnoreCase("java"));

        // Splitting
        String data = "apple,banana,grapes";
        String[] fruits = data.split(",");
        System.out.println("Fruits list:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Joining
        String joined = String.join("-", "One","Two","Three");
        System.out.println("Joined String: " + joined);
    }
}

