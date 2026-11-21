package Arrays;

import java.util.Arrays;
import java.util.Random;

public class StreamVsForLoop {

    public static void main(String[] args) {

        int size = 10_000_000;

        int[] numbers = new Random(42)
                .ints(size, 1, 100)
                .toArray();

        // Warm-up JVM
        for (int i = 0; i < 5; i++) {
            forLoop(numbers);
//            stream(numbers);
            parallelStream(numbers);
        }

        int iterations = 10;

        long forTotal = 0;
        long streamTotal = 0;

        long forResult = 0;
        long streamResult = 0;

        for (int i = 0; i < iterations; i++) {

            long start = System.nanoTime();
            forResult = forLoop(numbers);
            long end = System.nanoTime();

            forTotal += (end - start);


            start = System.nanoTime();
//            streamResult = stream(numbers);
            streamResult = parallelStream(numbers);
            end = System.nanoTime();

            streamTotal += (end - start);
        }

        System.out.println("For result:    " + forResult);
        System.out.println("Stream result: " + streamResult);

        System.out.println();

        System.out.println(
                "For loop average: " +
                        (forTotal / iterations) / 1_000_000.0 +
                        " ms"
        );

        System.out.println(
                "Stream average:   " +
                        (streamTotal / iterations) / 1_000_000.0 +
                        " ms"
        );
    }

    static long forLoop(int[] numbers) {

        long sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }

//    static long stream(int[] numbers) {
//
//        return Arrays.stream(numbers)
//                .filter(n -> n % 2 == 0)
//                .asLongStream()
//                .sum();
//    }

    static long parallelStream(int[] numbers) {

        return Arrays.stream(numbers)
                .parallel()
                .filter(n -> n % 2 == 0)
                .asLongStream()
                .sum();
    }
}
