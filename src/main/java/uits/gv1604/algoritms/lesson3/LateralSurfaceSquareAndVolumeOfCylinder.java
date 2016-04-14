package uits.gv1604.algoritms.lesson3;

import com.kaplan.library.CorrectEntry;

public class LateralSurfaceSquareAndVolumeOfCylinder {
    public static void main(String[] args) {
        byte choice;
        double heightOfCylinder;

        System.out.println("Select an option:");//Menu
        System.out.println("1. Volume of cylinder");
        System.out.println("2. Volume of the hollow cylinder");
        System.out.println("3. Square of lateral surface of cylinder");
        choice = CorrectEntry.enterValueForMenuOfThreeItems();
        switch (choice) {
            case 1:getAndPrintVolumeOfCylinder();
                break;
            case 2:getAndPrintVolumeOfHollowCylinder();
                break;
            case 3:getAndPrintLateralSurfaceOfSquareCylinder();
        }
    }

    public static void getAndPrintLateralSurfaceOfSquareCylinder() {
        double heightOfCylinder;
        heightOfCylinder = getHeight();
        double lateralSurfaceSquareOfCylinder = LengthAndSquareCircle.calculateLengthCircle() * heightOfCylinder;
        System.out.println(" Square of lateral surface of cylinder: " + lateralSurfaceSquareOfCylinder + " m^2");
    }

    public static void getAndPrintVolumeOfHollowCylinder() {
        double heightOfHollowCylinder = getHeight();
        double volumeOfHollowCylinder = LengthAndSquareCircle.calculateSquareOfRing() * heightOfHollowCylinder;
        System.out.println(" Volume of hollow cylinder: " + volumeOfHollowCylinder + " m^3");
    }

    public static void getAndPrintVolumeOfCylinder() {
        double heightOfCylinder;
        heightOfCylinder = getHeight();
        double volumeOfCylinder = LengthAndSquareCircle.calculateSquareOfCircle() * heightOfCylinder;
        System.out.println(" Volume of cylinder: " + volumeOfCylinder + " m^3");
    }

    public static double getHeight() {
        double height;
        System.out.println("Please enter the height of the cylinder, m: ");
        height = CorrectEntry.enterDoubleFromConsole();
        return height;
    }
}
