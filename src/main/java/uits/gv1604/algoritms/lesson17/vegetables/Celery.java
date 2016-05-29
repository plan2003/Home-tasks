package uits.gv1604.algoritms.lesson17.vegetables;

import uits.gv1604.algoritms.lesson17.Colors;
import uits.gv1604.algoritms.lesson17.Vegetable;

public class Celery extends Vegetable {
    public Celery(float weight, Colors color, boolean maturity, int condition) {
        super(weight, color, maturity, condition);
    }

    @Override
    public String toString() {
        return "Celery{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                ", signOfClean=" + signOfClean +
                "}";
    }
}
