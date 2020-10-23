import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("1 sayının asal çarpanlarını bulmak için 1'e basınız. \n" +
                "Girilen sayılarin OBEB ve OKEK'ini bulmak için 2'ye basınız.");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        if (secim==1){
            System.out.println("Sayıyı giriniz.");
            Scanner input1 = new Scanner(System.in);
            Sayi sayi = new Sayi(input1.nextInt());
            sayi.asalCarpanlarinaAyir();
            System.out.println(sayi);
        }
        else if (secim==2){
            ArrayList<Sayi> Sayilar = new ArrayList<>();
            System.out.println("Kac sayinin Obeb ve Okek'inin hesaplanacagini giriniz.");
            Scanner input5 = new Scanner(System.in);
            int adet = input5.nextInt();
            for (int i = 0; i < adet; i++) {
                System.out.println((i + 1) + ". sayıyı giriniz.");
                Scanner input2 = new Scanner(System.in);
                int deger1 = input2.nextInt();
                Sayi sayi = new Sayi(deger1);
                Sayilar.add(sayi);
            }
            Hesaplama hesaplama = new Hesaplama();
            hesaplama.obeb(Sayilar);
            hesaplama.okek(Sayilar);
        }
    }
}
