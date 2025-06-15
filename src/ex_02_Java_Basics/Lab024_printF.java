package ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int a = 10;
        int b = 20;
        boolean is_valid = true;
        //print --> print command print without the new line
        System.out.print("print command print without the new line");
        System.out.println("Hello World");
        System.out.println("add the new line in the end");

        System.out.println(a);
        System.out.printf("My first variable value is %d",a);
        System.out.println();
        System.out.printf("My second variable value is %d",b);
        System.out.println();
        System.out.printf("My boolean value is %b",is_valid);

        System.out.println( " --- ");
        System.out.printf("%d x %d",a,b);
    }
}
