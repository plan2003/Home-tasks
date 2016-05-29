package uits.gv1604.algoritms.lesson17;

public abstract class Plant implements Peelable {
   protected float weight;
    protected Colors color;
    protected boolean maturity;
    protected int condition;

    public Plant(float weight, Colors color, boolean maturity, int condition) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (Float.compare(plant.weight, weight) != 0) return false;
        if (maturity != plant.maturity) return false;
        if (condition != plant.condition) return false;
        return color == plant.color;

    }

    @Override
    public int hashCode() {
        int result = (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (maturity ? 1 : 0);
        result = 31 * result + condition;
        return result;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "weight=" + weight +
                ", color=" + color +
                ", maturity=" + maturity +
                ", condition=" + condition +
                '}';
    }
}


