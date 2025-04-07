package com.sunbeam;
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class IntStreamExample {
    public static void main(String[] args) {
        // Create an IntStream from 1 to 10
        IntStream numbers = IntStream.rangeClosed(1, 10);

        // Sum of numbers
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum: " + sum);

        // Summary Statistics
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum (from summary): " + stats.getSum());
    }
}
