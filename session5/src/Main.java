import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AracFactory aracFactory = new AracFactory();
        int garajKapasaite = 1;
        while(garajKapasaite<5 ||garajKapasaite>50){
            System.out.println("5-50 arasinda olacak sekilde garaj kapasitesini giriniz: ");
            Scanner input = new Scanner(System.in);
            garajKapasaite = input.nextInt();
        }
        Garaj garaj = Garaj.getInstance();
        garaj.kapasite = garajKapasaite;
        System.out.println("Garaja arac girisi yapmak icin GIR<TIP>,\nGarajdan cikis yapmak icin CIK<TIP>, \n" +
                "Garajdaki araclari listelemek icin LIST komutunu kullaniniz");
        System.out.println("Programdan cikmak icin quit komutunu kullaniniz.");
        while(true){
            Scanner sc = new Scanner(System.in);
            String entered = sc.nextLine();
            if (entered.matches("GIR<.*")){
                char[] tipo = entered.toCharArray();
                int tip = Character.getNumericValue(tipo[4]);
                Arac arac1 = aracFactory.getArac(tip);
                garaj.GIR(arac1,garajKapasaite);
                garaj.garajDurum(garajKapasaite);
            }
            else if(entered.matches("CIK<.*")){
                char[] tipo = entered.toCharArray();
                int tip = Character.getNumericValue(tipo[4]);
                garaj.CIK(tip);
                garaj.garajDurum(garajKapasaite);
            }
            else if(entered.matches("LIST")){
                garaj.LIST();
            }
            else if(entered.equalsIgnoreCase("quit")){
                System.exit(1);
            }
            else
                System.out.println("Lutfen gecerli bir giris yapin.");
        }
    }
}
