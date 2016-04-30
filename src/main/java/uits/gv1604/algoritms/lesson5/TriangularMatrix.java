package uits.gv1604.algoritms.lesson5;

import com.kaplan.library.CorrectEntry;
import com.kaplan.library.MatrixTool;

public class TriangularMatrix {
    public static void main(String[] args) {
        System.out.println("Set the size of a triangular array: ");
        int lines = CorrectEntry.enterIntFromConsole();
        if (lines == 0) {
            System.out.println("Correct printing is not possible.");
            System.exit(0);
        }
        int[][] arr = new int[lines][];
        for (int i = 0; i < lines; i++) {
            arr[i] = new int[i + 1];
        }
        MatrixTool.initArray(arr);
        System.out.println();
        MatrixTool.printArray(arr);
        System.out.println();
        System.out.println("Mirror vertically: ");
        displayMirrorVertically(arr);
        System.out.println("Mirror horizontally: ");
        displayMirrorHorizontallyViaNewMatrix(arr);
    }

    public static void displayMirrorHorizontallyViaNewMatrix(int array[][]) {
        int tempArray[][] = array;
        for (int k = 0; k < tempArray.length / 2; k++) {
            int temp[];
            temp = tempArray[k];
            tempArray[k] = tempArray[tempArray.length - k - 1];
            tempArray[tempArray.length - k - 1] = temp;

        }
        MatrixTool.printArray(tempArray);
    }

    public static void displayMirrorVertically(int array[][]) {
        int[][] tempArray = array;
        for (int k = 0; k < tempArray.length; k++) {
            for (int i = 0; i < tempArray.length - k; i++) {
                System.out.print("      ");
            }
            for (int j = tempArray[k].length - 1; j >= 0; j--) {
                System.out.print(tempArray[k][j] + "    ");
            }
            System.out.println();
        }

    }
}

