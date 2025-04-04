package com.sunbeam;
public class MinFinder {
    public static Number findMin(Number[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        Number min = numbers[0];
        for (Number num : numbers) {
            if (num.doubleValue() < min.doubleValue()) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Number[] intArray = {3, 1, 4, 1, 5, 9, 2};
        Number[] doubleArray = {2.5, 1.2, 3.8, 0.4, 5.9};

        System.out.println("Min Integer: " + findMin(intArray)); // Output: 1
        System.out.println("Min Double: " + findMin(doubleArray)); // Output: 0.4
    }
}
