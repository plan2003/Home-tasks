package com.kaplan.basictypes.lesson3;

import java.util.Scanner;

public class LengthAndSquareCircle {

    public static final double PI = 3.1415926536;

    public static void main(String[] args) {

        byte choice;


        System.out.println("Select an option:");//Menu
        System.out.println("1. Length of circle");
        System.out.println("2. Square of circle");
        System.out.println("3. Square of ring");
        choice = enterValidByteForMenuFromConsole();
        switch (choice) {
            case 1:
                double lengthOfCircle = calculateLengthCircle();
                System.out.println("Length of a circle: " + lengthOfCircle + " m");
                break;
            case 2:
                double squareOfCircle = calculateSquareOfCircle();
                System.out.println("Square of a circle: " + squareOfCircle + " m^2");
                break;
            case 3:
                double squareOfRing = calculateSquareOfRing();
                System.out.println("Square of a ring: " + squareOfRing + " m^2");
                break;
        }

    }

    public static double calculateSquareOfRing() {
        System.out.println("Outer radius. ");
        double outerRadius = getRadius();
        double innerRadius = 0;
        while (true) {
            System.out.println("Inner radius. ");
            innerRadius = getRadius();
            if (innerRadius > outerRadius) //To verify compliance with inner radius and the outer radius.
                System.out.println("The inner radius can't be more than the outer! Please try again.");
            else
                break;
        }
        return PI * (outerRadius * outerRadius - innerRadius * innerRadius);
    }

    public static double calculateSquareOfCircle() {
        double radius;
        radius = getRadius();
        return radius * radius * PI;
    }

    public static double calculateLengthCircle() {

        double radius;
        radius = getRadius();
        return radius * 2 * PI;

    }

    public static double getRadius() {
        double radius;
        System.out.println("Please enter the radius of the circle, m: ");
        radius = enterValidDoubleFromConsole();
        return radius;
    }

    public static double enterValidDoubleFromConsole() {

        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (true) {
            try {
                result = Double.parseDouble(scanner.nextLine());
                if (result < 0) {  //Condition of enter positive values or zero
                    throw new Exception();
                }
                break; //out of the endless loop in case of correct value
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }

    public static byte enterValidByteForMenuFromConsole() {

        Scanner scanner = new Scanner(System.in);
        byte result = 0;
        while (true) {
            try {
                result = Byte.parseByte(scanner.nextLine());
                if (result <= 0 || result > 3) {  //Condition of enter natural values from 1 to 3
                    throw new Exception();
                }
                break; //out of the endless loop in case of correct value
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }

}
