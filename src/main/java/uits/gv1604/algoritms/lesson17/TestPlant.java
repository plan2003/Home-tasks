package uits.gv1604.algoritms.lesson17;

import uits.gv1604.algoritms.lesson17.fruits.Apple;
import uits.gv1604.algoritms.lesson17.fruits.Banana;
import uits.gv1604.algoritms.lesson17.fruits.Orange;
import uits.gv1604.algoritms.lesson17.fruits.Pear;
import uits.gv1604.algoritms.lesson17.vegetables.Carrot;
import uits.gv1604.algoritms.lesson17.vegetables.Celery;
import uits.gv1604.algoritms.lesson17.vegetables.Onion;

import java.util.Arrays;
import java.util.Scanner;

public class TestPlant {
    public static void main(String[] args) {
        Plant[] anotherPlants = new Plant[4];
        anotherPlants[0] = new Carrot(20.0f, Colors.Orange, true, 10);
        anotherPlants[1] = new Carrot(21.0f, Colors.Orange, true, 9);
        anotherPlants[2] = new Orange(22.0f, Colors.Orange, true, 8);
        anotherPlants[3] = new Carrot(23.0f, Colors.Orange, true, 7);
        Plant[] oneMorePlants = new Plant[3];
        oneMorePlants[0] = new Onion(2.0f, Colors.Gold, true, 7);
        oneMorePlants[1] = new Banana(4.0f, Colors.Green, true, 9);
        oneMorePlants[2] = new Onion(5.0f, Colors.Green, true, 9);
        Fruit ap = new Apple(50.0f, Colors.Red, true, 10);
        Vegetable veg = new Celery(100.0f, Colors.Beige, true, 9);
        Fruit pear = new Pear(7, Colors.Yellow, true, 6);


        System.out.println("Before clean: weight =" + ap.weight + ", and sign of clean -" + ap.signOfClean);
        ap.peel();
        System.out.println("After clean: weight =" + ap.weight + ", and sign of clean -" + ap.signOfClean);
        ap.peel();
        System.out.println("Second attempt clean: weight =" + ap.weight + ", and sign of clean -"
                + ap.signOfClean);
        System.out.println();
        veg.peel();
        System.out.println("Enter size of basket:");
        int quantity = enterQuantityFromConsole();
        Basket basket = new Basket(quantity);
        basket.put(ap);
        basket.print();
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
        pear.peel();
        basket.print();
        System.out.println();
        basket.put(anotherPlants);
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
        basket.print();
        System.out.println("Size of basket = " + (basket.index + 1));
        basket.put(oneMorePlants);
        basket.put(new Pear(8, Colors.Green, true, 7));
        basket.print();
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
       //--------------------------------------------
        System.out.println("Enter size of second basket:");
        int quantity2 = enterQuantityFromConsole();
        Basket basket2 = new Basket(quantity2, true);
        System.out.println("Second basket: ");
        basket2.print();
        basket.put(basket2);
        System.out.println("First and second basket: ");
        basket.put(new Pear(11111111.9f, Colors.Rose, true, 9));
        basket.print();
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
        basket.extract(2);
        basket.print();
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
        System.out.println(basket.extract(12));
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));
        System.out.println(Arrays.toString(basket.extractAll()));
        System.out.println();
        basket.put(ap);
       // basket.put(anotherPlants);
        basket.print();
        //--------------------------------------------
        System.out.println("Basket with fruits: ----");
        System.out.println(Arrays.toString(basket.extractAllFruits()));
        basket.print();
        System.out.println("Capacity of basket = " + basket.plants.length);
        System.out.println("Size of basket = " + (basket.index + 1));

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
