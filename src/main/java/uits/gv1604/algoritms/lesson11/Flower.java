package uits.gv1604.algoritms.lesson11;




public abstract class Flower {
    private String color;
    private int freshness;
    private double stemLength;
    private float averegePrice;

    public Flower(float averegePrice, String color, int freshness, double stemLength) {
        this.averegePrice = averegePrice;
        this.color = color;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public float getAveregePrice() {
        return averegePrice;
    }


    abstract float getRealPrice();

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", averegePrice=" + averegePrice +
                '}';
    }
}

class Rose extends Flower {
    private final static String NAME = "Rose";

    @Override
    public String toString() {
        return NAME + " {" +
                "color='" + getColor() + '\'' +
                ", freshness=" + getFreshness() +
                ", stemLength=" + getStemLength() +
                ", averegePrice=" + getAveregePrice() +
                '}';
    }

    public Rose(float averegePrice, String color, int freshness, double stemLength) {
        super(averegePrice, color, freshness, stemLength);

    }

    @Override
    float getRealPrice() {
        return (getAveregePrice() / 10) * getFreshness();
    }
}

class Tulip extends Flower {
    private final static String NAME = "Tulip";

    public Tulip(float averegePrice, String color, int freshness, double stemLength) {
        super(averegePrice, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return NAME + " {" +
                "color='" + getColor() + '\'' +
                ", freshness=" + getFreshness() +
                ", stemLength=" + getStemLength() +
                ", averegePrice=" + getAveregePrice() +
                '}';
    }
    @Override
    float getRealPrice() {
        return (getAveregePrice() / 10) * getFreshness();
    }

}
class Lilia extends Flower {
    private final static String NAME = "Lilia";



    public Lilia(float averegePrice, String color, int freshness, double stemLength) {
        super(averegePrice, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return NAME +" {" +
                "color='" + getColor() + '\'' +
                ", freshness=" + getFreshness() +
                ", stemLength=" + getStemLength() +
                ", averegePrice=" + getAveregePrice() +
                '}';
    }

    @Override
    float getRealPrice() {
        return (getAveregePrice() / 10) * getFreshness();
    }
}