import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garaj {
    private static Garaj garaj;
    ArrayList<Arac> list = new ArrayList<>();
    int kapasite;
    int mevcutKapasite;
    private Garaj(){}
    public static Garaj getInstance(){
        if(garaj==null){
            garaj = new Garaj();
        }
        return garaj;
    }
    public void GIR(Arac arac, int garajKapasaite){
        if (arac.getKapasite() <= (garajKapasaite - garaj.getMevcutKapasite(garaj.list))){
            list.add(arac);
            System.out.println(arac.getAracTip() + " girisi gerceklesti");
        }
        else
            System.out.println("Garajda araciniz icin yer yoktur.");

    }
    public void CIK(int aracTipi){
        int x = 0;
        try {
            while (list.get(x).getAracIndex() != aracTipi) {
                x++;
            }
            System.out.println(list.get(x).getAracTip() + " cikisi gerceklesti");
            list.remove(x);
        } catch (Exception e) {
            System.out.println("Garajda belirttiginiz tipte arac yoktur.");
        }
    }
    public void LIST(){
        System.out.println("garajdaki araclar: ");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).getAracTip());
        }
    }

    public int getMevcutKapasite(ArrayList<Arac> list){
        mevcutKapasite = 0;
        for (int i = 0; i < list.size(); i++) {
            mevcutKapasite += list.get(i).getKapasite();
        }
        return mevcutKapasite;
    }
     public void garajDurum(int garajKapasite){
        int current = getMevcutKapasite(list);
        int kalan = garajKapasite - current;
         System.out.println("garajda kullanilan kapasite: " + current +
                 " ,garajda kalan kapasite: " + kalan);
     }
}
