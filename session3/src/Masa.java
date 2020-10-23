public class Masa {

    private Deste deste;
    private int oyuncuSayisi = 4;
    private Oyuncu[] oyuncular = new Oyuncu[oyuncuSayisi];
    private int desteSayisi;
    private int eldekiKart = 12;

    public Masa(){
        int destede =0;
        deste = new Deste();
        Kart[] karilmis = deste.karistir();
        for (int i = 0; i < 4; i++) {
            Kart[] el = new Kart[12];
            int elde = 1;
            while (elde % 13 != 0){
                el[elde-1] = karilmis[destede];
                elde++;
                destede++;
            }
            oyuncular[i] = new Oyuncu(el);
        }
    }

    public String toString() {
        for (int i = 0; i < oyuncuSayisi; i++)
            System.out.printf( "%-30s", (i+1) + ". oyuncunun eli: ");
        System.out.println();
        for (int i = 0; i < eldekiKart ; i++) {
            for (int j = 0; j <oyuncuSayisi ; j++) {
                System.out.printf ("%-30s", oyuncular[j].getKartlarim()[i]);
            }
            System.out.println();
        }
        return "Kartlar dagitildi.";
    }

    public static void main(String[] args) {
        Masa masa = new Masa();
        System.out.println(masa);
    }

}
