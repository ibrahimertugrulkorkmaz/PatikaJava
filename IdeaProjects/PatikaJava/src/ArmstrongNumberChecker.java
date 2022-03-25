import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {

        int sayi,tempSayi,basamakSayisi=0,basDegeri,basUs,result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        sayi=input.nextInt();
        tempSayi=sayi;

        while(sayi!=0){
            sayi/=10;
            basamakSayisi++;
        }
        sayi=tempSayi;
        while(tempSayi != 0){
            basDegeri=tempSayi%10;
            basUs=1;
            for(int i=1;i<=basamakSayisi;i++){
                basUs*=basDegeri;
            }
            result+=basUs;
            tempSayi/=10;
        }
        if(sayi==result)
            System.out.println(result+ " sayisi Armstrong sayidir.");
        else
            System.out.println(result +" sayisi Armstrong sayi degildir.");

    }
}
