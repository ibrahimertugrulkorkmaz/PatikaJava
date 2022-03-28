import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        int enBuyukSayi,enKucukSayi,temp,sayiAdet,ilkSayi,sayac=2;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayi gireceksiniz? ");
        sayiAdet = input.nextInt();
        if(sayiAdet<=1){
            System.out.println("Karşılaştırma yapabilmek için 1'den fazla sayı girmeniz gerekmektedir.");
            System.exit(0);
        }
        System.out.println("1. sayiyi giriniz: ");
        ilkSayi=input.nextInt();
        enBuyukSayi=ilkSayi;
        enKucukSayi=ilkSayi;

        for(int i=1;i<(sayiAdet);i++){
            System.out.println(sayac+ ". sayiyi giriniz: ");
            temp = input.nextInt();
            sayac++;
            if(temp>enBuyukSayi){
                enBuyukSayi=temp;
            }
            else if(temp<enKucukSayi){
                enKucukSayi=temp;
            }
        }
        System.out.println("En buyuk sayi:  "+enBuyukSayi+" En kucuk sayi: "+enKucukSayi);
    }
}


