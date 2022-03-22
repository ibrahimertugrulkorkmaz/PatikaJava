import java.util.Scanner;
/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

public class VatCalculator {

    public static void main(String[] args) {
        double hamUcret;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV hesaplanmasını yapmak istediğiniz tutarı giriniz  ");
        hamUcret = input.nextInt();

        double sonuc = (hamUcret >=1000) ? 0.08 : 0.18;

        double kdvUcreti= hamUcret * sonuc;
        double toplamTutar = kdvUcreti + hamUcret;
        System.out.println("KDV'siz ücret: " + hamUcret + "TL\n" + "KDV ücreti: " + sonuc*1000 + "TL\n" + "KDV'li ücret: " + toplamTutar + "TL\n");

    }
}
