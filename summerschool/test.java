
public class test {

    public static void testPerformance(int numberOfInputs) {
        int[] inputs = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; i++) {
            inputs[i] = (int)(Math.random() * 100);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfInputs; i++) {
            Integer.bitCount(inputs[i]);
        }
        long endTime = System.nanoTime();
        long builtInDuration = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numberOfInputs; i++) {
            myInteger.bitCount(inputs[i]);
        }
        endTime = System.nanoTime();
        long manualDuration = endTime - startTime;


        System.out.println("Built in function time: " + builtInDuration + " nanoseconds");
        System.out.println("Manual function time: " + manualDuration + " nanoseconds");
    }

    public static void main(String[] args) {
        testPerformance(1000);
    }
}
