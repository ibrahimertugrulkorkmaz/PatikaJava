import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int us;
        Scanner input = new Scanner(System.in);
        System.out.print("Gireceginiz sayiya kadar olan 4'ün ve 5'ün kuvvetleri yazdirilacak. Lütfen sayi giriniz: ");
        us = input.nextInt();

        for(int i=1;i<=us ;i*=4){

            System.out.println(i);
        }
        for(int j=1;j<=us ;j*=5){

            System.out.println(j);
        }
    }
}
