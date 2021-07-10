package com.company;

public class Circle {
    //initialize variables
    private double radius;
    private double pi = (double) Math.PI;

    //create the constructors
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    //create the getters and setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    //create the methods
    public double circumference() {
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public double area() {
        double area = pi * Math.pow(radius, 2);
        return area;
    }
}
