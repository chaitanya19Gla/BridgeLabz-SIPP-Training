public class Concatenation {
    public static void main(String[] args) {
        int iterations = 10000; // Number of iterations for testing

        // Test String concatenation
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a"; // Concatenating using String
        }
        long endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        System.out.println("Time taken for String concatenation: " + stringTime + " ns");

        // Test StringBuilder concatenation
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a"); // Concatenating using StringBuilder
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken for StringBuilder concatenation: " + stringBuilderTime + " ns");

        // Test StringBuffer concatenation
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a"); // Concatenating using StringBuffer
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken for StringBuffer concatenation: " + stringBufferTime + " ns");

        // Summary of results
        System.out.println("\nSummary of results:");
        System.out.println("String concatenation time: " + stringTime + " ns");
        System.out.println("StringBuilder concatenation time: " + stringBuilderTime + " ns");
        System.out.println("StringBuffer concatenation time: " + stringBufferTime + " ns");
    }
}