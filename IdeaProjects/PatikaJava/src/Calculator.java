import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int islemTuru;
        double sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Yapmak istediginiz islemin numarasını giriniz\n Toplama: 1\n Çıkarma: 2\n Çarpma için: 3\n Bölme için:4\n");
        System.out.print("Seçiminiz: ");
        islemTuru = input.nextInt();
        if (islemTuru <= 0 || islemTuru >= 6) {
            System.out.println("Girmis oldugunuz deger islem numaraları içerisinde değildir");
            System.exit(0);
        }
        System.out.println("İslem yapmak istediginiz ilk elemanın degerini giriniz");
        int sayi1 = input.nextInt();
        System.out.println("İslem yapmak istediginiz ikinci elemanın degerini giriniz");
        int sayi2 = input.nextInt();
        switch (islemTuru) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Cevap " + sonuc);
                break;
            case 2:
                if (sayi1 > sayi2) {
                    sonuc = sayi1 - sayi2;
                    System.out.println("Cevap " + sonuc);
                } else {
                    sonuc = sayi2 - sayi1;
                    System.out.println("Cevap " + sonuc);
                }
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Cevap " + sonuc);
                break;
            case 4:
                if(sayi2 == 0){
                    System.out.println("Bolen degerini sıfır olarak giremezsiniz");
                }
                else{
                    sonuc = sayi1 / sayi2;
                    System.out.println("Cevap "+sonuc);
                }

                break;
        }

    }

}
