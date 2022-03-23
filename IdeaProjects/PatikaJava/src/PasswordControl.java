import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        String sifre = "As1357**";
        Scanner input = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz");
        String sifreGiris = input.nextLine();
        if (sifreGiris.equals(sifre)) {
            System.out.println("Basariyla giris yaptiniz");
        } else {
            System.out.println("Sifrenizi yanlis girdiniz, sifrenizi hatirlamiyorsaniz sıfırlamak ister misiniz?\n [evet/hayır]");
            String control = input.nextLine();
            if (control.equals("evet")) {
                System.out.print("Yeni sifrenizi giriniz: ");
                String yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Sifreniz basariyla olusturuldu");
                    sifre = yeniSifre;
                }
            } else
                System.out.println("Yeni sifre olusturulamadi, lütfen şifrenizi tekrar girmeyi deneyiniz");
        }
    }
}
