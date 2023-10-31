
public class Car{
    private String назва;
    private String модель;
    private int рікВипуску;
    private double ціна;
    private boolean включено;

    public Машина(String назва, String модель, int рікВипуску, double ціна, boolean включено) {
        this.назва = назва;
        this.модель = модель;
        this.рікВипуску = рікВипуску;
        this.ціна = ціна;
        this.включено = включено;
    }

    public String getНазва() {
        return назва;
    }

    public void setНазва(String назва) {
        this.назва = назва;
    }

    public String getМодель() {
        return модель;
    }

    public void setМодель(String модель) {
        this.модель = модель;
    }

    public int getРікВипуску() {
        return рікВипуску;
    }

    public void setРікВипуску(int рікВипуску) {
        this.рікВипуску = рікВипуску;
    }

    public double getЦіна() {
        return ціна;
    }

    public void setЦіна(double ціна) {
        this.ціна = ціна;
    }

    public boolean isВключено() {
        return включено;
    }

    public void setВключено(boolean включено) {
        this.включено = включено;
    }

    @Override
    public String toString() {
        return "Машина{" +
                "назва='" + назва + '\'' +
                ", модель='" + модель + '\'' +
                ", рікВипуску=" + рікВипуску +
                ", ціна=" + ціна +
                ", включено=" + включено +
                '}';
    }

    public static void main(String[] args) {
        Машина машина = new Машина("Bwm", "first", 2010, 10000, true);
        System.out.println(машина.toString());
    }
}