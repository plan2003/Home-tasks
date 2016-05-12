package uits.gv1604.algoritms.lesson11;

import java.util.Arrays;
import java.util.Random;

public class Bouquet {

    int quantity;
    Flower[] flowers;
    String[] accessories = {"ribbon", "oilcloth", "decorations"};
    private String accessory;
    Random random = new Random();
    static final float MIN_STEM_OF_FLOWER = 30.0f;
    static final float MAX_STEM_LENGTH_OF_FLOWER = 70.0f;
    static float MIN_PRICE_OF_LILIA = 80.0f;
    static final float MAX_PRICE_OF_LILIA = 100.0f;
    static final float MIN_PRICE_OF_TULIP = 20.0f;
    static final float MAX_PRICE_OF_TULIP = 40.0f;
    static final float MIN_PRICE_OF_ROSE = 50.0f;
    static final float MAX_PRICE_OF_ROSE = 70.0f;
    static final float PRICE_OF_RIBBON = 5.5f;
    static final float PRICE_OF_OILCLOTH = 7.4f;
    static final float PRICE_OF_DECORATIONS = 3.7f;

    public Bouquet(int quantity) {
        this.quantity = quantity;
        flowers = new Flower[quantity];
    }

    public void getBouqet() {
        int choice;
        float priceOfLilia = random.nextFloat() * (MAX_PRICE_OF_LILIA - MIN_PRICE_OF_LILIA + 1.0f) + MIN_PRICE_OF_LILIA;
        float priceOfTulip = random.nextFloat() * (MAX_PRICE_OF_TULIP - MIN_PRICE_OF_TULIP + 1.0f) + MIN_PRICE_OF_TULIP;
        float priceOfRose = random.nextFloat() * (MAX_PRICE_OF_ROSE - MIN_PRICE_OF_ROSE + 1.0f) + MIN_PRICE_OF_ROSE;



        for (int i = 0; i < flowers.length; i++) {
            float stemOfFlower =
                    random.nextFloat() * (MAX_STEM_LENGTH_OF_FLOWER - MIN_STEM_OF_FLOWER + 1.0f) + MIN_STEM_OF_FLOWER;
            choice = random.nextInt(3);

            switch (choice) {
                case 0:
                    flowers[i] = new Lilia(priceOfLilia, "white", random.nextInt(10)+1, stemOfFlower);
                    break;
                case 1:
                    flowers[i] = new Rose(priceOfRose, "red", random.nextInt(10)+1, stemOfFlower);
                    break;
                case 2:
                    flowers[i] = new Tulip(priceOfTulip, "yellow", random.nextInt(10)+1, stemOfFlower);
                    break;

            }

            System.out.println();
        }
    }

    public void print() {
        for (int i = 0; i < quantity; i++) {
            System.out.println("N" + (i + 1) + " - " + flowers[i]);
        }
        int choise = random.nextInt(3);
        accessory = accessories[choise];
        System.out.println("Bouquet has accessory -" + accessory);
    }

    public float getPriceOfBouquet() {
        float result = 0;
        switch (accessory) {
            case "ribbon":
                result = PRICE_OF_RIBBON;
                break;
            case "oilcloth":
                result = PRICE_OF_OILCLOTH;
                break;
            case "decorations":
                result = PRICE_OF_DECORATIONS;
                break;
        }
        System.out.println("Price of accesory - " + result);
        for (int i = 0; i < quantity; i++) {
            result += flowers[i].getRealPrice();
            System.out.println("Price of flower N" +(i+1) + "  - " + flowers[i].getRealPrice());
        }
        System.out.println("Price of whole bouquet - " + result);
        return result;

    }
   public void sortBouquetByStemLength(){
        Arrays.sort(flowers);
       System.out.println("Sort bouquet: ");
       this.print();
    }


}


