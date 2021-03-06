import com.sun.source.tree.BreakTree;

public class Oyuncu {
    private Kart[] kartlarim;
    private int kartlarimSayisi = Masa.eldekiKart;
    Kart[] duzenli;


    public Oyuncu(Kart[] kartlarim, int kartlarimSayisi){
        this.kartlarim = duzenle(kartlarim);
        this.kartlarimSayisi = kartlarimSayisi;
    }

    public Kart[] getKartlarim() {
        return kartlarim;
    }

    public Kart[] duzenle(Kart[] kartlarim){
        duzenli = new Kart[kartlarimSayisi];
        Kart temp;
        char[] siralar = {'2','3','4','5','6','7','8','9','J','Q','K','A'};
        String[] tipler = {"Sinek","Karo","Maca","Kupa"};
        int index = 0;
        for (int i = 0; i < tipler.length ; i++) {
            for (int j = 0; j < siralar.length; j++) {
                for (int k = 0; k < kartlarim.length; k++) {
                    if(kartlarim[k].getTip()==tipler[i] && kartlarim[k].getSira() == siralar[j]){
                        duzenli[index] = kartlarim[k];
                        index ++;
                    }
                }
            }
        }
        return duzenli;
    }

    public String toString(){
        for (int i = 0; i < 12; i++) {
            System.out.println(duzenle(kartlarim)[i]);
        }
        return "bitti";
    }
}
