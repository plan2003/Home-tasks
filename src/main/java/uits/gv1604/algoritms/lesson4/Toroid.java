package uits.gv1604.algoritms.lesson4;


import com.kaplan.library.CorrectEntry;
import uits.gv1604.algoritms.lesson3.LengthAndSquareCircle;

import java.util.Scanner;

public class Toroid {
    public static void main(String[] args) {
        byte choice;
        double heightOfCylinder;

        System.out.println("Select an option:");//Menu
        System.out.println("1. Square of surface of the toroid");
        System.out.println("2. Volume of the toroid");
        choice = CorrectEntry.enterValueForMenuOfTwoItems();
        switch (choice) {
            case 1:
                getAndPrintSquareOfSurfaceOfToroid();
                break;
            case 2:
                getAndPrintVolumeOfToroid();
                break;
        }
    }

    public static void getAndPrintVolumeOfToroid() {
        double volumeOfToroid = calculateVolumeOfToroid();
        System.out.println(" Volume of the toroid: " + volumeOfToroid + " m^3");
    }

    public static void getAndPrintSquareOfSurfaceOfToroid() {
        double squareOfSurfaceOfToroid = calculateSquareOfSurfaceOfToroid();
        System.out.println("Square of surface of the toroid: " + squareOfSurfaceOfToroid + " m^2");
    }

    private static double calculateVolumeOfToroid() {
        System.out.println("Distance from the center of the circumference to the axis of rotation. ");
        double bigRadius = CorrectEntry.getRadius();
        System.out.println("Radius of the circumference ");
        double smallRadius = CorrectEntry.getRadius();
        return 2 * Math.PI * Math.PI * bigRadius * smallRadius * smallRadius;
    }


    /*public static byte enterValidByteForMenuFromConsole() {

        Scanner scanner = new Scanner(System.in);
        byte result = 0;
        while (true) {
            try {
                result = Byte.parseByte(scanner.nextLine());
                if (result <= 0 || result > 2) {  //Condition of enter natural values from 1 to 2
                    throw new Exception();
                }
                break; //out of the endless loop in case of correct value
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;*/

   // }

    public static double calculateSquareOfSurfaceOfToroid() {
        System.out.println("Distance from the center of the circumference to the axis of rotation. ");
        double bigRadius = CorrectEntry.getRadius();
        System.out.println("Radius of the circumference ");
        double smallRadius = CorrectEntry.getRadius();

        return 4 * Math.PI * Math.PI * bigRadius * smallRadius;
    }
}