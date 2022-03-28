import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gireceginiz iki sayi degeri arasındaki asal sayilar bulunacaktır. İlk sayiyi giriniz: ");
        int baslangic = input.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        int bitis = input.nextInt();
        for(int i=baslangic;i<=bitis;i++){
            int x=0;
            for(int j=2;j<(i-1);j++){
                if(i%j==0){
                    x=1;
                    break;
                }
            }
            if (x==0){
                System.out.print(i+ " ");}
        }
    }
}
