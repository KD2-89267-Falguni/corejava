package com.sunbeam;

import java.util.stream.IntStream;
import java.util.Scanner;

public class SumWithStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = IntStream.rangeClosed(1, n).sum();
        System.out.println("Sum of integers from 1 to " + n + " is: " + sum);

        sc.close();
    }
}

