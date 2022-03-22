import java.util.Scanner;

public class TaksimeterPriceCalculator {
    public static void main(String[] args) {
        int km, acilisUcreti=10;
        double perKm= 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Taksi ile gitmek istediğiniz mesafe kaç km? ");
        km = input.nextInt();
        double toplamTutar = (km*perKm) + acilisUcreti;
        double ucretKontrol = (toplamTutar<=20) ? 20 : toplamTutar;
        System.out.println("Ödenecek Toplam Tutariniz: " + ucretKontrol + "TL'dir.");
    }
}
