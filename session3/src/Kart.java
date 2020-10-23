public class Kart {
    private final String tip;
    private final char sira;

    public Kart(String kartTip, char kartSira){
        this.tip = kartTip;
        this.sira = kartSira;
    }

    public char getSira() {
        return sira;
    }

    public String getTip() {
        return tip;
    }

    public String toString(){
        return tip + " " + sira;
    }
}
