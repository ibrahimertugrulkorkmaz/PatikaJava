import java.util.Scanner;

public class ExponentialNumberCalculator {
    public static void main(String[] args) {
        int sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int tabanSayi = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int usSayi = input.nextInt();
        if (usSayi == 0) {
            sonuc = 1;
            System.out.println("Cevap: " + sonuc);
        } else if (usSayi > 0) {
            sonuc = tabanSayi;
            for (int i = 1; i < usSayi; i++) {
                sonuc = sonuc * tabanSayi;
            }
            System.out.println("Cevap " + sonuc);

        } else {
            usSayi *= -1;
            sonuc = tabanSayi;
            for (int i = 1; i < usSayi; i++) {
                sonuc = sonuc * tabanSayi;


            }
            System.out.print("1\n----------\n" + sonuc);

        }

    }
}
