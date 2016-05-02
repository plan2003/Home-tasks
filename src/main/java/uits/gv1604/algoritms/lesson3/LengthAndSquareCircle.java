package uits.gv1604.algoritms.lesson3;

import com.kaplan.library.CorrectEntry;


public class LengthAndSquareCircle {

    public static void main(String[] args) {

        byte choice;


        System.out.println("Select an option:");//Menu
        System.out.println("1. Length of circle");
        System.out.println("2. Square of circle");
        System.out.println("3. Square of ring");
        choice = CorrectEntry.enterValueForMenuOfThreeItems();

        switch (choice) {
            case 1:
                getAndPrintLengthOfCircle();
                break;
            case 2:
                getAndPrintSquareOfCircle();
                break;
            case 3:
                getAndPrintSquareOfRing();
                break;
        }

    }

    public static void getAndPrintSquareOfRing() {
        double squareOfRing = calculateSquareOfRing();
        System.out.println("Square of a ring: " + squareOfRing + " m^2");
    }

    public static void getAndPrintSquareOfCircle() {
        double squareOfCircle = calculateSquareOfCircle();
        System.out.println("Square of a circle: " + squareOfCircle + " m^2");
    }

    public static void getAndPrintLengthOfCircle() {
        double lengthOfCircle = calculateLengthCircle();
        System.out.println("Length of a circle: " + lengthOfCircle + " m");
    }

    public static double calculateSquareOfRing() {
        System.out.println("Outer radius. ");
        double outerRadius = CorrectEntry.getRadius();
        double innerRadius = 0;
        while (true) {
            System.out.println("Inner radius. ");
            innerRadius = CorrectEntry.getRadius();
            if (innerRadius > outerRadius) //To verify compliance with inner radius and the outer radius.
                System.out.println("The inner radius can't be more than the outer! Please try again.");
            else {
                break;
            }
        }
        return Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);
    }

    public static double calculateSquareOfCircle() {
        double radius;
        radius = CorrectEntry.getRadius();
        return radius * radius * Math.PI;
    }

    public static double calculateLengthCircle() {

        double radius;
        radius = CorrectEntry.getRadius();
        return radius * 2 * Math.PI;

    }


}
