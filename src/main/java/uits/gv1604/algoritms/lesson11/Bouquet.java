package uits.gv1604.algoritms.lesson11;

import java.util.Random;

public class Bouquet {
  //  private static Bouquet thiz;
  int quantity;
    public Bouquet(int quantity ) {
        this.quantity = quantity;
    }
    String[] accessories = {"ribbon", "oilcloth", "decorations"};

    private String accessory;
    Random random = new Random();
    // quantity = random.nextInt(30) + 1;
    Flower[] flowers = new Flower[quantity];

    public void getBouqet() {
        int choise;
        float minStemLenthOfFlower = 30.0f;
        float maxStemLenthOfFlower = 70.0f;
        float minPriceOfLilia = 80.0f;
        float maxPriceOfLilia = 100.0f;
        float minPriceOfTulip = 20.0f;
        float maxPriceOfTulip = 40.0f;
        float minPriceOfRose = 50.0f;
        float maxPriceOfRose = 70.0f;
        float priceOfLilia = random.nextFloat() * (maxPriceOfLilia - minPriceOfLilia + 1.0f) + minPriceOfLilia;
        float priceOfTulip = random.nextFloat() * (maxPriceOfTulip - minPriceOfTulip + 1.0f) + minPriceOfTulip;
        float priceOfRose = random.nextFloat() * (maxPriceOfRose - minPriceOfRose + 1.0f) + minPriceOfRose;

        for (int i = 0; i < flowers.length; i++) {
            choise = random.nextInt(3);
            switch (choise) {
                case 0:
                    flowers[i] = new Lilia(priceOfLilia, "white", random.nextInt(10) , random.nextDouble());
                    break;
                case 1:
                    flowers[i] = new Rose(priceOfRose, "red", random.nextInt(10) , random.nextDouble());
                    break;
                case 2:
                    flowers[i] = new Tulip(priceOfTulip, "yellow", random.nextInt(10) , random.nextDouble());
                    break;

            }

            System.out.println();
        }
    }


   /* public static Bouquet getInstance() {
        if (thiz == null) {
            thiz = new Bouquet();
        }
        return thiz;
    }*/

    public void print() {
        for (int i = 0; i < quantity; i++) {
            System.out.println("N" + (i + 1) + " - " + flowers[i]);
        }
        int choise = random.nextInt(3);
        accessory = accessories[choise];
        System.out.println("Bouquet has accessory -" + accessory);
    }


}


