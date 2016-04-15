package uits.gv1604.algoritms.lesson5;


import java.util.Arrays;

public class ShiftOneDimensionalArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        shiftLeftByNumberPosition(arr, 3);
        System.out.println();
        shiftRightByNumberPosition(arr, 2);
    }

    private static void shiftLeftByNumberPosition(int[] arr, int num) {
        int[] tempArr = new int[arr.length];
        System.arraycopy(arr, 0, tempArr, arr.length - 1, 1);
        System.arraycopy(arr, 1, tempArr, 0, arr.length - 1);
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
        if (num > 1) {
            shiftLeftByNumberPosition(arr, num - 1);
        }

    }

    public static void shiftRightByNumberPosition(int[] array, int number) {

        int[] tempArray = new int[array.length];
        System.arraycopy(array, array.length - 1, tempArray, 0, 1);
        System.arraycopy(array, 0, tempArray, 1, array.length - 1);
        array = tempArray;
        System.out.println(Arrays.toString(array));
        if (number > 1) {
            shiftRightByNumberPosition(array, number - 1);
        }
    }
}
