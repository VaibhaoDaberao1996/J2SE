package multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Multi threadin shows a diffrence in large number of datasets or its calculation
public class MultithreadingDemo {

    // Method to calculate the sum of an array in a single-threaded manner
    public static long singleThreadSum(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Task for calculating a part of the array sum (for multithreading)
    static class ArraySumTask implements Callable<Long> {
        private final int[] array;
        private final int start;
        private final int end;

        public ArraySumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    // Method to calculate the sum of an array using multiple threads
    public static long multiThreadSum(int[] array, int numThreads) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int length = array.length;
        int chunkSize = length / numThreads;
        Future<Long>[] futures = new Future[numThreads];

        // Submit tasks to the executor
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? length : (i + 1) * chunkSize;
            futures[i] = executor.submit(new ArraySumTask(array, start, end));
        }

        // Collect results
        long totalSum = 0;
        for (Future<Long> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a large array of random integers
        int arraySize = 5_00_000_000;
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100);
        }

        // Single-threaded execution
        long startTime = System.currentTimeMillis();
        long singleThreadSum = singleThreadSum(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Single-thread sum: " + singleThreadSum + " Time: " + (endTime - startTime) + " ms");

        // Multi-threaded execution
        int numThreads = 8; // You can change this to experiment
        startTime = System.currentTimeMillis();
        long multiThreadSum = multiThreadSum(array, numThreads);
        endTime = System.currentTimeMillis();
        System.out.println("Multi-thread sum: " + multiThreadSum + " Time: " + (endTime - startTime) + " ms");
    }
}
