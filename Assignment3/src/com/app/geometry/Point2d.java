package com.app.geometry;

public class Point2d {
    private double x, y;

    // Constructor to initialize x and y coordinates
    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return details of the point
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2d other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate the distance between two points
    public double calculateDistance(Point2d other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }
}

