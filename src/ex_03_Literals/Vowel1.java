package ex_03_Literals;

import java.util.Scanner;

public class Vowel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase for easy comparison
        input = input.toLowerCase();

        System.out.print("Vowels in the string: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
