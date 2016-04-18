package uits.gv1604.algoritms.lesson5;

import java.util.Arrays;
import java.util.Random;

public class ShiftTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[9][4];
        initArray(arr);
        System.out.println("Source array: ");
        printArray(arr);
        shiftDownByNumberPosition(arr, 1);
        printArray(arr);
        shiftUpByNumberPosition(arr, 8);
        printArray(arr);
        shiftLeftByNumberPosition(arr, 45);
        printArray(arr);
        shiftRightByNumberPosition(arr, 2);
        printArray(arr);

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "       ");
            }
            System.out.println();
        }
    }

    private static void shiftUpByNumberPosition(int[][] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift up = " + actualShift);
        if (actualShift <= 0) {
            return;
        } else {
            for (int k = 1; k <= actualShift; k++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    int temp[];
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    private static void shiftDownByNumberPosition(int[][] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift down = " + actualShift);

        if (actualShift <= 0) {
            return;
        } else {
            for (int k = 1; k <= actualShift; k++) {
                for (int j = arr.length - 1; j > 0; j--) {
                    int temp[];
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }
        }
    }

    private static void shiftLeftByNumberPosition(int[][] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift on left = " + actualShift);
        if (actualShift <= 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int tempArr[] = new int[arr[i].length];
            System.arraycopy(arr[i], 0, tempArr, arr[i].length - actualShift, actualShift);
            System.arraycopy(arr[i], actualShift, tempArr, 0, arr[i].length - actualShift);
            arr[i] = tempArr;
        }
    }

    private static void shiftRightByNumberPosition(int[][] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift on right = " + actualShift);
        if (actualShift <= 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int tempArr[] = new int[arr[i].length];
            System.arraycopy(arr[i], arr[i].length - actualShift, tempArr, 0, actualShift);
            System.arraycopy(arr[i], 0, tempArr, actualShift, arr[i].length - actualShift);
            arr[i] = tempArr;
        }
    }

    public static void initArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = i * arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (j + x);
            }
        }
    }

    public static void initArrayRandomly(int[][] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = i * arr.length + rnd.nextInt(arr.length);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(j + x);
            }
        }
    }
}
