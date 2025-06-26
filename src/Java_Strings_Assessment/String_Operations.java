package Java_Strings_Assessment;

public class String_Operations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concatString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatString);

        int length = concatString.length();
        System.out.println("Length: " + length); //String Length

        char ch = concatString.charAt(1);
        System.out.println("First Character: " + ch); //First String

        String substr = concatString.substring(6);
        System.out.println("Substring: " + substr); //Substring


    }
}
