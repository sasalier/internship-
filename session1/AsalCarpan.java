public class AsalCarpan extends Sayi {
    private int asalDeger;
    private int katsayi;
    Sayi sayi;

    public AsalCarpan(int asalDeger, int katsayi){
        this.asalDeger = asalDeger;
        this.katsayi = katsayi;
    }

    public int getAsalDeger() {
        return asalDeger;
    }

    public void setAsalDeger(int asalDeger) {
        this.asalDeger = asalDeger;
    }

    public int getKatsayi() {
        return katsayi;
    }

    public void setKatsayi(int katsayi) {
        this.katsayi = katsayi;
    }

    //TODO SET GET METHODS

    public String toString(){
        return getAsalDeger() + " asal çarpanına ait katsayı: " + getKatsayi();
    }
}
