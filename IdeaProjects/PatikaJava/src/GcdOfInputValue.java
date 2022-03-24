import java.util.Scanner;

public class GcdOfInputValue {
    public static void main(String[] args) {
       int sayi,count=0,toplam=0,ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        sayi = input.nextInt();
       for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                toplam +=i;
                count++;
            }
       }
       ortalama = toplam / count;
       System.out.println("Hem 3'e hem 4'e bölünen sayıların ortalaması: " +ortalama);
    }
}

