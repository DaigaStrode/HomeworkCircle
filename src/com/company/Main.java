package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the radius: ");
//        Circle theCircle = new Circle(scanner.nextDouble());
//        System.out.println("The circumference is: " + theCircle.circumference());
//        System.out.println("The area is: " + theCircle.area());

        System.out.print("How many circles to create: ");
        Circle[] circles = new Circle[scanner.nextInt()];
        for (int i = 0; i < circles.length; i++) {
            Circle theCircle = new Circle();
            System.out.print("Enter the radius: ");
            theCircle.setRadius(scanner.nextDouble());
            System.out.println("The circumference is: " + theCircle.circumference());
            System.out.println("The area is: " + theCircle.area());
        }
    }
}
