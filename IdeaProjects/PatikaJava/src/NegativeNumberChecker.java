import java.util.Scanner;

public class NegativeNumberChecker {
    public static void main(String[] args) {
        // created with while loop
       int sayi;
       do {
           Scanner input = new Scanner(System.in);
           System.out.println("Yeni sayi giriniz: ");
           sayi= input.nextInt();
       }
        while (sayi>=0);{

        }
        System.out.println("Negatif Sayi girdiniz program sonlandiriliyor: ");

        System.out.println("-------------------");
        //created with for loop
        int ifsayi;
        for (;;){
            Scanner input2 = new Scanner((System.in));
            System.out.print("Yeni sayi giriniz:");
            ifsayi = input2.nextInt();
            if(ifsayi>=0){
                continue;
            }
            else
                System.out.println("Girdiginiz sayi degeri negatiftir");
            System.exit(0);
        }
    }
}
