import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int boyut;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için gireceğiniz boyut: ");
        boyut= input.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sonuc;
        sonuc=sayi1+sayi2;
        System.out.print("0 1 1");
        for(int i=0;i<boyut;i++) {

            sayi1=sayi2;
            sayi2=sonuc;
            sonuc=sayi1+sayi2;
            System.out.print(" "+sonuc);
        }
        }
    }

