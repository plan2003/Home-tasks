package uits.gv1604.algoritms.lesson11;

import java.util.Scanner;

public class TestBouqet {
    public static void main(String[] args) {
        System.out.println("Set the quantity of flowers: ");
        int q = enterQuantityFromConsole();
        Bouquet bouquet = new Bouquet(q  );
        bouquet.getBouqet();
        bouquet.print();
        bouquet.getPriceOfBouquet();
        bouquet.sortBouquetByFreshness();
        bouquet.printFlowersByStemLengthRange();
    }
    public static int enterQuantityFromConsole() {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < 1 || result > 100) {
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
