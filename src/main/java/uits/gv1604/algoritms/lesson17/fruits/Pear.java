package uits.gv1604.algoritms.lesson17.fruits;

import uits.gv1604.algoritms.lesson17.Colors;
import uits.gv1604.algoritms.lesson17.Fruit;

public class Pear extends Fruit {
    public Pear(float weight, Colors color, boolean maturity, int condition) {
        super(weight, color, maturity, condition);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                ", signOfClean=" + signOfClean +
                "}";
    }
}
