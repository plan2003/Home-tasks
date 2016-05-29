package uits.gv1604.algoritms.lesson17;

public class Fruit extends Plant {
    protected boolean signOfClean;
    public Fruit(float weight, Colors color, boolean maturity, int condition) {
        super(weight, color, maturity, condition);
    }


    @Override
    public void peel() {
        if (signOfClean == false) {
            this.weight = (this.weight/100)*98;
            signOfClean = true;
        }

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                ", signOfClean=" + signOfClean +
                '}';
    }
}
