import java.util.Scanner;

public class InputNumbersOrder {
    public static void main(String[] args) {
        int say=1, buyukSayi =0, kucukSayi =0, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Gireceginiz sayi adedi nedir : ");
        int i = input.nextInt();
        if (i >=2) {

            for (; i > 0; i--) {
                System.out.print(say + "Sayı giriniz : ");
                temp = input.nextInt();
                if (say==1)
                {
                    buyukSayi = temp;
                    kucukSayi = temp;
                }
                if (temp < kucukSayi) kucukSayi = temp;
                else if(temp > buyukSayi) buyukSayi = temp;
                say++;
            }
            System.out.println("En büyük sayı : "+ buyukSayi);
            System.out.print("En küçük sayı : "+ kucukSayi);
        }
        else {
            System.out.println("İkiden daha az sayi girdiniz.");
        }
    }
}

