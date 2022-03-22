import java.util.Scanner;
/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

public class GroceryCashierProgram {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican= 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut almak istersiniz? ");
        int armutkg = input.nextInt();
        System.out.print("Kaç kilo elma almak istersiniz? ");
        int elmakg = input.nextInt();
        System.out.print("Kaç kilo domates almak istersiniz? ");
        int domateskg = input.nextInt();
        System.out.print("Kaç kilo muz almak istersiniz? ");
        int muzkg = input.nextInt();
        System.out.print("Kaç kilo patlıcan almak istersiniz? ");
        int patlicankg = input.nextInt();

        double toplamTutar = (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg) + (patlicankg*patlican);
        System.out.println("Alinan armut kg:" + armutkg + "\n" + "Alinan elmak kg: " + elmakg + "\n" + "Alinan domates kg: " + domateskg + "\n" + "Alinan muz kg: " + muzkg + "\n" + "Alinan patlıcan kg: " + patlicankg + "\n" + "Toplam Tutar: " + toplamTutar + "TL'dir.");

    }
}
