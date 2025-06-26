package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        // 1. Unary Plus (+) int a = +5;  // a is 5
        // 2. Unary Minus (-)
        // 3. Increment Operators (++)
        // 4. Decrement Operators (--)
        // 5. Logical Complement (!)
        // 6. Bitwise Complement (~)
        // Unary Operator
       // int a = 5;
       // int b = -a;  // b is -5

        int a = +10;
        // int a = 10; optional
        int a1 = -110;
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);

    }
}
