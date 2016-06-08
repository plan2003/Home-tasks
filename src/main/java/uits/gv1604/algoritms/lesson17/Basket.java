package uits.gv1604.algoritms.lesson17;

import uits.gv1604.algoritms.lesson17.fruits.Apple;
import uits.gv1604.algoritms.lesson17.fruits.Banana;
import uits.gv1604.algoritms.lesson17.fruits.Orange;
import uits.gv1604.algoritms.lesson17.fruits.Pear;
import uits.gv1604.algoritms.lesson17.vegetables.Carrot;
import uits.gv1604.algoritms.lesson17.vegetables.Celery;
import uits.gv1604.algoritms.lesson17.vegetables.Onion;
import uits.gv1604.algoritms.lesson17.vegetables.Potato;

import java.util.Random;

public class Basket {
    Plant[] plants;
    boolean genarateOfBasket;
    Random random = new Random();
    static final int MIN_CONDITION = 4;
    static final int MAX_CONDITION = 10;
    static final float MIN_WEIGHT = 0.4f;
    static final float MAX_WEIGHT = 0.1f;
     private int index = -1;
    private int size = index + 1;

    public Basket(int len) {
        if (len > 10) {
            this.plants = new Plant[len];
        } else {
            this.plants = new Plant[10];
        }
    }

    public Basket(int len, boolean genarateOfBasket) {
        this.genarateOfBasket = genarateOfBasket;

        if (len > 10) {
            this.plants = new Plant[len];
        } else {
            this.plants = new Plant[10];
        }
        if (genarateOfBasket == true) {

            for (int i = 0; i < len; i++) {
                int choice = random.nextInt(8);
                int choiceOfCondition = random.nextInt(6) + MIN_CONDITION;
                float choiceOfWeight = random.nextFloat() * (MAX_WEIGHT + MIN_WEIGHT)+ MIN_WEIGHT;
                switch (choice) {
                    case 0:
                        plants[i] = new Potato(choiceOfWeight, Colors.Rose, true, choiceOfCondition);
                        break;
                    case 1:
                        plants[i] = new Celery(choiceOfWeight, Colors.Beige, true, choiceOfCondition);
                        break;
                    case 2:
                        plants[i] = new Onion(choiceOfWeight, Colors.Gold, true, choiceOfCondition);
                        break;
                    case 3:
                        plants[i] = new Carrot(choiceOfWeight, Colors.Orange, true, choiceOfCondition);
                        break;
                    case 4:
                        plants[i] = new Banana(choiceOfWeight, Colors.Yellow, true, choiceOfCondition);
                        break;
                    case 5:
                        plants[i] = new Pear(choiceOfWeight, Colors.Yellow, true, choiceOfCondition);
                        break;
                    case 6:
                        plants[i] = new Apple(choiceOfWeight, Colors.Green, true, choiceOfCondition);
                        break;
                    default:
                        plants[i] = new Orange(choiceOfWeight, Colors.Orange, true, choiceOfCondition);
                        break;
                }
            }
        }
        index = len;
    }

    public void put(Plant plant) {
        index++;

        if (plants.length <= index) {
            Plant[] temp = new Plant[((plants.length * 3) / 2) + 1];
            for (int i = 0; i < plants.length; i++) {
                temp[i] = plants[i];
            }
            plants = temp;
        }
        plants[index] = plant;
    }

    public void put(Plant[] pl) {
        Plant[] tempArray = new Plant[plants.length + pl.length];
        for (int i = 0; i < plants.length; i++) {
            tempArray[i] = plants[i];
        }
        for (int curI = index + 1; curI < ((index + 1) + pl.length); curI++) {
            tempArray[curI] = pl[curI - (index + 1)];
        }
        plants = tempArray;
        for (int k = 0; k < pl.length; k++) {
            if (pl[k] != null) index++;
        }
    }

    public void put(Basket basket) {
        Plant[] pl = basket.plants;
        this.put(pl);
    }

    public void print() {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null)
                System.out.println(i + " = " + plants[i]);
        }
    }

    public Plant extract(int indexOfEx) {
        if (indexOfEx <= index) {
            Plant[] temp = plants;
            System.arraycopy(temp, indexOfEx + 1, plants, indexOfEx, plants.length - indexOfEx - 1);
            index--;
            return plants[indexOfEx];
        } else throw new IndexOutOfBoundsException("No such index in the basket!");
    }

    public Plant[] extractAll() {
        Plant[] temp = plants;
        plants = new Plant[10];
        index = -1;
        return temp;
    }

    public int getSize() {
        size = index + 1;
        return size;
    }

    public Plant[] extractAllFruits() {
        Plant[] temp = new Plant[plants.length];
        Plant[] tempForThis = new Plant[plants.length];
        int count = 0, countForThis = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] instanceof Fruit) {
                temp[count++] = plants[i];
            } else {
                if (plants[i]!= null) {
                    tempForThis[countForThis++] = plants[i];
                }
            }
        }
        Plant[] resultArrayFruits = new Plant[count];
        for (int k = 0; k < resultArrayFruits.length; k++) {
            resultArrayFruits[k] = temp[k];
        }
        Plant[] resultForThis = new Plant[countForThis];
        for (int k = 0; k < resultForThis.length; k++) {
            resultForThis[k] = tempForThis[k];
        }
        plants = resultForThis;
        this.index = resultForThis.length - 1;
        return resultArrayFruits;


    }
    public Plant[] extractAllVegetables() {
        Plant[] temp = new Plant[plants.length];
        Plant[] tempForThis = new Plant[plants.length];
        int count = 0, countForThis = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] instanceof Vegetable) {
                temp[count++] = plants[i];
            } else {
                if (plants[i]!= null) {
                    tempForThis[countForThis++] = plants[i];
                }
            }
        }
        Plant[] resultArrayVegetables = new Plant[count];
        for (int k = 0; k < resultArrayVegetables.length; k++) {
            resultArrayVegetables[k] = temp[k];
        }
        Plant[] resultForThis = new Plant[countForThis];
        for (int k = 0; k < resultForThis.length; k++) {
            resultForThis[k] = tempForThis[k];
        }
        plants = resultForThis;
        this.index = resultForThis.length - 1;
        return resultArrayVegetables;


    }
}
