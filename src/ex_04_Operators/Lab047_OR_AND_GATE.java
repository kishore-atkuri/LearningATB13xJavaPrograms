package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        //  And  && // only true && true returns true
        //

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("============");

        // || - OR
        //        // T || T -> T
        //        // T || F -> T
        //        // F || T -> T
        //        // F || F -> F
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
