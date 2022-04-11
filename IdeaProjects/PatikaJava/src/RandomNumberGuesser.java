import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess,difference,temp=0,count=0;
        int countLimit=5;
        int number = (int) (Math.random()*100);
        while(count<=countLimit){
            System.out.print("Sayi tahmin ediniz:");
            guess= input.nextInt();
            if(guess<0 || guess>100){
                System.out.println("Hatali giris yaptiniz! 1-100 arasinda bir deger giriniz");

            }
            else if(number<guess){
                difference=guess-number;
                System.out.println("Yanlis cevap! Sayiya "+difference+"kadar yakinsiniz");
            }
            else if(number>guess){
                difference=number-guess;
                System.out.println("Yanlis cevap! Sayiya "+difference+"kadar yakinsiniz.");
            }
            else if(guess==number){
                System.out.println("Sayiyi tahmin ettiniz. Tebrikler!");
                break;
            }
        count++;
            if(count>=5){
                System.out.println("5 deneme hakkinizi yitirdiniz. Program kapatılıyor.");
                break;
            }
        }
    }
}