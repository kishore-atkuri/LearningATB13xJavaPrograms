package Java_Strings_Assessment;

public class String_Comparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

        // Using == operator (reference comparison)
        System.out.println("str1 == str2: " + (str1 == str2));  // true (both refer to same literal)
        System.out.println("str1 == str3: " + (str1 == str3));  // false (s3 is a new object)

        // Using equals() method
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));

        // Using equalsIgnoreCase() method
        System.out.println("str1.equalsIgnoreCase(s4): " + str1.equalsIgnoreCase(str4));

        // Using compareTo() method (lexicographic comparison)
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1));
    }
}
