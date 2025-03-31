package com.app.tester;
import com.app.geometry.Point2d;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates for Point 1
        System.out.println("Enter coordinates for Point 1 (x y): ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        Point2d p1 = new Point2d(x1, y1);

        // Accept coordinates for Point 2
        System.out.println("Enter coordinates for Point 2 (x y): ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        Point2d p2 = new Point2d(x2, y2);

        // Display point details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if the points are the same or different
        if (p1.isEqual(p2)) {
            System.out.println("Points are the same.");
        } else {
            System.out.println("Points are different.");
            System.out.println("Distance between points: " + p1.calculateDistance(p2));
        }

        sc.close();
    }
}

