import java.util.Scanner;
/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.*/

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz ");
        kilo = input.nextDouble();

        double kitleEndeksi = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleEndeksi);
    }
}
