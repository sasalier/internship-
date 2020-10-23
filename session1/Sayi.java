import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Sayi {
    private int deger;
    private List<AsalCarpan> asalCarpanList = new ArrayList<>();
    private int girilen;

    public Sayi(int deger){
        this.deger = deger;
    }
    int katsayi = 1;
    public void asalCarpanlarinaAyir(){
        girilen = deger;
        while (deger%2 == 0) {
            katsayi++;
            deger /= 2;
        }
        if (girilen % 2==0){
            AsalCarpan carpan = new AsalCarpan(2,katsayi-1);
            asalCarpanList.add(carpan);
        }
        for (int i = 3; i <= sqrt(deger); i = i+2) {
            katsayi = 1;
            while (deger%i == 0) {
                if(katsayi>1){
                    asalCarpanList.remove(asalCarpanList.size()-1);
                }
                AsalCarpan carpan1 = new AsalCarpan(i,katsayi);
                asalCarpanList.add(carpan1);
                katsayi++;
                deger /= i;
            }
        }
        katsayi = 1;
        if (deger > 2){
            AsalCarpan carpan2 = new AsalCarpan(deger,katsayi);
            asalCarpanList.add(carpan2);
        }
    }

    public List<AsalCarpan> getAsalCarpanList() {
        return asalCarpanList;
    }

    public void setAsalCarpanList(List<AsalCarpan> asalCarpanList) {
        this.asalCarpanList = asalCarpanList;
    }

    public int getDeger() {
        return deger;
    }

    public void setDeger(int deger) {
        this.deger = deger;
    }

    public String toString(){
        return girilen + " sayisinin asal carpanlari: " + asalCarpanList;
    }
}
