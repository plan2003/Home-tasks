package uits.gv1604.algoritms.lesson5;

import com.kaplan.library.CorrectEntry;

import java.util.Arrays;

public class TransposedMatrix {
    public static void main(String[] args) {
        System.out.println("Set the size of a two-dimensional array: ");
        System.out.println("Number of lines: ");
        int lines = CorrectEntry.enterIntFromConsole();
        System.out.println("Number of columns: ");
        int columns = CorrectEntry.enterIntFromConsole();
        if (lines == 0 || columns == 0) {
            System.out.println("Correct transposition and printing is not possible.");
            System.exit(0);
        }
        int[][] arr = new int[lines][columns];

        initArray(arr);
        System.out.println("Source array: ");
        printArray(arr);
        int[][] transArr = new int[arr[lines - 1].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transArr[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed array: ");
        printArray(transArr);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "       ");
            }
            System.out.println();
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
}
