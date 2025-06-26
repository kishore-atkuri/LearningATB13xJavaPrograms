package Java_Strings_Assessment;

public class String_Concat_Performance {
    public static void main(String[] args) {
        int iterations = 100_000;

        // String concatenation with +
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String (+) time: " + (endTime - startTime) + " ms");

        // StringBuilder concatenation
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        String resultSb = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");

        // StringBuffer concatenation
        startTime = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("a");
        }
        String resultSbuf = sbuf.toString();
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
    }
}
