import java.util.Scanner;

public class BiletDeneme {
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Mesafeyi kim cinsinden giriniz.");
        int mesafe = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double birimFiyat = 0.10;
        double toplamTutar = mesafe * birimFiyat;

        if(mesafe <= 0 || yas <= 0 || (yolculukTipi !=1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        }  else {
            if (yas < 12) {
                toplamTutar *= 0.5; //%50 indirim uygula
            } else if (yas <= 24) {
                toplamTutar *= 0.9; //%10 indirim uygula
            } else if (yas > 65) {
                toplamTutar *= 0.7; //%30 indirim uygula
            }

            if (yolculukTipi == 2) {
                toplamTutar *= 0.8; // %20 indirim uygula
            }

            System.out.println("Toplam Tutar = " + toplamTutar + "TL");



        }
    }

