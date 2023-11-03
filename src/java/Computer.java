public class Computer {
    private String gs12;
    private String Artline;
    private int g1920x1080 ;

    public Computer(String gs12, String Artline, int g1920x1080) {
        this.gs12 =gs12;
        this.Artline = Artline;
        this. g1920x1080= g1920x1080;
    }
    public String getGs12() {
        return gs12;
    }

    public void setGs12(String gs12) {
        this.gs12 = gs12;
    }

    public String getArtline() {
        return Artline;
    }

    public void setArtline(String Artline) {
        this.Artline = Artline;
    }

    public int getG1920x1080() {
        return g1920x1080;
    }

    public void setG1920x1080(int g1920x1080) {
        this.g1920x1080 = g1920x1080;
    }
}