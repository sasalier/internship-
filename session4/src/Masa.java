import java.util.Scanner;

public class Masa {

    private Deste[] desteler;
    static int oyuncuSayisi;
    private Oyuncu[] oyuncular = new Oyuncu[oyuncuSayisi];
    static int desteSayisi;
    static int eldekiKart;
    Kart[] toplu = new Kart[(desteSayisi*48)];

    public Masa(int desteSayisi, int oyuncuSayisi){
        int destede =0;
        int total = 0;
        desteler = new Deste[desteSayisi];
        /*deste = new Deste();*/
        for (int i = 0; i < desteSayisi; i++) {
            desteler[i] = new Deste();
            Kart[] karts = desteler[i].karistir();
            for (int j = 0; j < karts.length ; j++) {
                toplu[total] = karts[j];
                total++;
            }
        }
        /*Kart[] karilmis = deste.karistir();*/
        for (int i = 0; i < oyuncuSayisi; i++) {
            Kart[] el = new Kart[eldekiKart];
            int elde = 1;
            while (elde % (eldekiKart+1) != 0){
                el[elde-1] = toplu[destede];
                elde++;
                destede++;
            }
            oyuncular[i] = new Oyuncu(el, eldekiKart);
        }
    }

    public String toString() {
        for (int i = 0; i < oyuncuSayisi; i++)
            System.out.printf( "%-22s", (i+1) + ". oyuncunun eli: ");
        System.out.println();
        for (int i = 0; i < eldekiKart ; i++) {
            for (int j = 0; j <oyuncuSayisi ; j++) {
                System.out.printf ("%-22s", oyuncular[j].getKartlarim()[i]);
            }
            System.out.println();
        }
        return "Kartlar dagitildi.";
    }

    public static void main(String[] args) {
        System.out.println("deste sayisi:");
        Scanner input = new Scanner(System.in);
        desteSayisi = input.nextInt();
        System.out.println("oyuncu sayisi: ");
        Scanner input2 = new Scanner(System.in);
        oyuncuSayisi = input2.nextInt();
        eldekiKart = (desteSayisi*48/oyuncuSayisi);
        Masa masa = new Masa(desteSayisi,oyuncuSayisi);
        System.out.println(masa);
    }

}
