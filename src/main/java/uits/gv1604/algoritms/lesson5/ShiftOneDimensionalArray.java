package uits.gv1604.algoritms.lesson5;


import java.util.Arrays;

public class ShiftOneDimensionalArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        array = shiftRight(array);
        System.out.println(Arrays.toString((array)));
        array = shiftLeft(array);
        array = shiftLeft(array);
        array = shiftLeft(array);
        System.out.println(Arrays.toString((array)));


    }

    public static int [] shiftLeft(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = 0;
            // System.out.println(tempArray[i]);
        }
        System.arraycopy(array, 0, tempArray, array.length - 1, 1);
        System.arraycopy(array, 1, tempArray, 0, array.length - 1);
        return tempArray;

    }
    public static int [] shiftRight(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = 0;
        }
        System.arraycopy(array,  array.length - 1, tempArray,0, 1);
        System.arraycopy(array, 0, tempArray, 1, array.length - 1);
        return tempArray;

    }
}
