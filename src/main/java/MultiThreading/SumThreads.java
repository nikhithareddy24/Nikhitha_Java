package main.java.MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class SumThreads {
    public static final int ARRAY_SIZE = 100;
    public static final int THREAD_COUNT = 5;

    public static int[] array = new int[ARRAY_SIZE];
    public static int[] partialSums = new int[THREAD_COUNT];

    public static void main(String[] args) {
        // Fill the array with values from 1 to 100
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }


        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        // Calculate partial sums using multiple threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * (ARRAY_SIZE / THREAD_COUNT);
            int endIndex = startIndex + (ARRAY_SIZE / THREAD_COUNT);

            executor.execute(new PartialSumCalculator(i, startIndex, endIndex));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine partial sums to get the final sum
        int finalSum = 0;
        for (int sum : partialSums) {
            finalSum += sum;
        }

        System.out.println("Final sum: " + finalSum);
    }

    private static class PartialSumCalculator implements Runnable {
        private int threadId;
        private int startIndex;
        private int endIndex;

        public PartialSumCalculator(int threadId, int startIndex, int endIndex) {
            this.threadId = threadId;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }

            partialSums[threadId] = sum;
        }
    }
}
