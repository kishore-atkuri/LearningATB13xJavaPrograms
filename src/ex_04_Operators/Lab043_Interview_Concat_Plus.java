package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        // BODMAS - Bracket of Div, mul, add, sub

        String first_name = "Kishore";
        String last_name = "Babu";

        int a = 10;
        int b = 20;

        System.out.println(first_name + last_name + a + b); // KishoreBabu1020
        System.out.println(a + b + first_name + last_name); // 30KishoreBabu
        System.out.println(first_name + last_name + (a + b)); // KishoreBabu30
    }
}
