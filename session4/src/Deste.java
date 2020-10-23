import java.security.SecureRandom;

public class Deste {
    private Kart[] deste;
    private static final int KART_SAYISI = 48;
    private static final SecureRandom rastgele = new SecureRandom();

    public Deste(){
        char[] siralar = {'2','3','4','5','6','7','8','9','J','Q','K','A'};
        String[] tipler = {"Sinek","Karo","Maca","Kupa"};
        deste = new Kart[KART_SAYISI];
        for (int i = 0; i < deste.length; i++) {
            int x = i/siralar.length;
            int y = i%siralar.length;
            deste[i]=new Kart(tipler[x], siralar[y]);
        }
    }

    public Kart[] karistir(){
        for (int ilk = 0; ilk < deste.length ; ilk++) {
            int ikinci = rastgele.nextInt(KART_SAYISI);
            Kart gecici = deste[ilk];
            deste[ilk] = deste[ikinci];
            deste[ikinci] = gecici;
        }
        return deste;
    }
}
