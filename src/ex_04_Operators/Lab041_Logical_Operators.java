package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));  // false
        System.out.println("a || b = " + (a || b));  // true
        System.out.println("!a = " + (!a));          // false

        int x = 10, y = 20;
        System.out.println("x > 5 && y < 30: " + (x > 5 && y < 30));   // true
        System.out.println("x < 5 || y > 15: " + (x < 5 || y > 15));   // true
    }
}
