package uits.gv1604.algoritms.lesson17.vegetables;

import uits.gv1604.algoritms.lesson17.Colors;
import uits.gv1604.algoritms.lesson17.Vegetable;

public class Onion extends Vegetable {
    public Onion(float weight, Colors color, boolean maturity, int condition) {
        super(weight, color, maturity, condition);
    }

    @Override
    public String toString() {
        return "Onion{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                ", signOfClean=" + signOfClean +
                "}";
    }
}
