package com.kaplan.library;

import java.util.Random;

/**
 * Created by ִלטענטי on 19.04.2016 22:48.
 */
public class MatrixTool {
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

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "       ");
            }
            System.out.println();
        }
    }
}
