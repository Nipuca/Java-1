
public class Car {
    private String Bmw;
    private String e60;
    private int d2009;
    private double price;
    private boolean included;

    public Car(String Bmw, String e60, int d2009, double price, boolean included) {
        this.Bmw = Bmw;
        this.e60 = e60;
        this.d2009 = d2009;
        this.price = price;
        this.included = included;
    }

    public String getBmw() {
        return Bmw;
    }

    public void setBmw(String Bmw) {
        this.Bmw = Bmw;
    }

    public String gete60() {
        return e60;
    }

    public void setE60(String e60) {
        this.e60 = e60;
    }

    public int getd2009() {
        return d2009;
    }

    public void set2009(int d2009) {
        this.d2009 = d2009;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    @Override
    public String toString() {
        return "Машина{" +
                "Bmw='" + Bmw + '\'' +
                ", e60='" + e60 + '\'' +
                ", d2009=" + d2009 +
                ", price=" + price +
                ", included=" + included +
                '}';
    }

    public static void main(String[] args) {
        Car Bmw = new Bmw("Bwm", "first", 2010, 10000, true);
        System.out.println(Bmw.toString());
    }
}