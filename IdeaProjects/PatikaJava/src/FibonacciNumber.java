import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int boyut,sayi1=0,sayi2=0,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için gireceğiniz boyut: ");
        boyut= input.nextInt();
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

