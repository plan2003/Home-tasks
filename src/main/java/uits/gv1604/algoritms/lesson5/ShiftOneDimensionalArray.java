package uits.gv1604.algoritms.lesson5;


import java.util.Arrays;

public class ShiftOneDimensionalArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        shiftRightByNumberPosition(arr, 3);
        shiftLeftByNumberPosition(arr, 17);
        // recShiftLeftByNumberPosition(arr, 67);
        //.......recShiftRightByNumberPosition(arr, 45604);
    }

    private static void shiftLeftByNumberPosition(int[] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift on left = " + actualShift);
        int[] tempArr = new int[arr.length];
        if (actualShift <= 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        System.arraycopy(arr, 0, tempArr, arr.length - actualShift, actualShift);
        System.arraycopy(arr, actualShift, tempArr, 0, arr.length - actualShift);
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftRightByNumberPosition(int[] arr, int num) {
        int actualShift = num % arr.length;
        System.out.println("Actual shift on right = " + actualShift);
        int[] tempArr = new int[arr.length];
        if (actualShift <= 0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        System.arraycopy(arr, arr.length - actualShift, tempArr, 0, actualShift);
        System.arraycopy(arr, 0, tempArr, actualShift, arr.length - actualShift);
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }

    private static void recShiftLeftByNumberPosition(int[] arr, int num) {
        int actualShift = num % arr.length;
        // System.out.println("Actual shift = " + actualShift);
        int[] tempArr = new int[arr.length];
        if (actualShift <= 0) {
            return;
        }
        System.arraycopy(arr, 0, tempArr, arr.length - 1, 1);
        System.arraycopy(arr, 1, tempArr, 0, arr.length - 1);
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
        if (actualShift > 1) {
            recShiftLeftByNumberPosition(arr, actualShift - 1);
        }

    }

    public static void recShiftRightByNumberPosition(int[] array, int number) {
        int actualShift = number % array.length;
        //System.out.println("Actual shift = " + actualShift);
        int[] tempArray = new int[array.length];
        if (actualShift <= 0) {
            return;
        }
        System.arraycopy(array, array.length - 1, tempArray, 0, 1);
        System.arraycopy(array, 0, tempArray, 1, array.length - 1);
        array = tempArray;
        System.out.println(Arrays.toString(array));
        if (number > 1) {
            recShiftRightByNumberPosition(array, number - 1);
        }
    }
}
