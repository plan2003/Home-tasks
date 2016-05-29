package uits.gv1604.algoritms.lesson17.fruits;


import uits.gv1604.algoritms.lesson17.Colors;
import uits.gv1604.algoritms.lesson17.Fruit;

public class Apple extends Fruit {
    public Apple(float weight, Colors color, boolean maturity, int condition) {
        super(weight, color, maturity, condition);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                ", signOfClean=" + signOfClean +
                "}";
    }
}
