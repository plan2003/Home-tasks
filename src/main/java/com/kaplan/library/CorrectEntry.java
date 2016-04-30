package com.kaplan.library;

import java.util.Scanner;

/**
 * Created by ִלטענטי on 10.04.2016 18:16.
 */
public class CorrectEntry {
    public static byte enterValueForMenuOfThreeItems() {

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
    public static byte enterValueForMenuOfTwoItems() {

        Scanner scanner = new Scanner(System.in);
        byte result = 0;
        while (true) {
            try {
                result = Byte.parseByte(scanner.nextLine());
                if (result <= 0 || result > 2) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;

    }
    public static double getRadius() {
        double radius;
        System.out.println("Please enter the radius of the circle, m: ");
        radius = enterDoubleFromConsole();
        return radius;
    }
    public static double enterDoubleFromConsole() {

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
    public static int enterIntFromConsole() {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < 0 || result > 100) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }
    public static int enterYearFromConsole() {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < 1960 || result > 2016) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }
}
