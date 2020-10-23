import java.util.ArrayList;

public class Hesaplama {
    ArrayList<Sayi> sayilar;

    public Hesaplama(){
    }

    public void obeb(ArrayList<Sayi> sayilar){
        ArrayList<Integer> obeb = new ArrayList();
        ArrayList<Integer> obebKatsayi = new ArrayList();
        ArrayList<Integer> obebden = new ArrayList();
        ArrayList<Integer> obebdenKatsayi = new ArrayList();
        int a, b, c;
        int obebSonuc = 1;
        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.get(i).asalCarpanlarinaAyir();
        }
        for (int i = 0; i < sayilar.get(0).getAsalCarpanList().size(); i++) {
            obeb.add(sayilar.get(0).getAsalCarpanList().get(i).getAsalDeger());
            obebKatsayi.add((sayilar.get(0).getAsalCarpanList().get(i).getKatsayi()));
        }
        for (int i = 1; i < sayilar.size(); i++) {
            for (int k = 0; k < (sayilar.get(i).getAsalCarpanList().size()); k++) {
                obebden.add(sayilar.get(i).getAsalCarpanList().get(k).getAsalDeger());
                obebdenKatsayi.add(sayilar.get(i).getAsalCarpanList().get(k).getKatsayi());
            }
            for(int j = 0;j<obeb.size();j++) {
                if(!obebden.contains(obeb.get(j))){
                    obeb.set(j, 1);
                }
                else{
                    a = obebKatsayi.get(j);
                    b = obebdenKatsayi.get(obebden.indexOf(obeb.get(j)));
                    c = Math.min(a,b);
                    obebKatsayi.set(j, c);
                }
            }
            obebden.clear();
            obebdenKatsayi.clear();
        }
        for (int i = 0; i <obeb.size() ; i++) {
            obebSonuc *= Math.pow(obeb.get(i), obebKatsayi.get(i));
        }
        System.out.println("sayilarin obeb'i: " + obebSonuc);
    }

    public void okek(ArrayList<Sayi> sayilar){
        int x, a, b, c;
        int okekSonuc =1;
        ArrayList<Integer> asal = new ArrayList();
        ArrayList<Integer> katsayi = new ArrayList();
        for (int i = 0; i < sayilar.size() ; i++) {
            for (int j = 0; j < sayilar.get(i).getAsalCarpanList().size(); j++) {
                x = sayilar.get(i).getAsalCarpanList().get(j).getAsalDeger();
                if (!asal.contains(x)) {
                    asal.add(x);
                    katsayi.add(sayilar.get(i).getAsalCarpanList().get(j).getKatsayi());
                } else {
                    c = katsayi.get(asal.indexOf(x));
                    b = sayilar.get(i).getAsalCarpanList().get(j).getKatsayi();
                    a = Math.max(b, c);
                    katsayi.set(asal.indexOf(x), a);
                }
            }
        }
        for (int i = 0; i < asal.size(); i++)
            okekSonuc *= Math.pow(asal.get(i), katsayi.get(i));

        System.out.println("sayilarin okek'i: " + okekSonuc);
    }
}
