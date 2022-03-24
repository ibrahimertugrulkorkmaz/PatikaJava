import java.util.Scanner;

public class EvenNumbersAndModChecker {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayi giriniz: ");
            sayi = input.nextInt();

            if (sayi % 4 == 0)
                toplam += sayi;
        }
        while (sayi % 2 == 0);
        {
        }
        System.out.println("Tek sayi girdiniz. Girilen sayılar arasından 4'e tam bölünebilen sayiların toplamı: " + toplam+"'dir.");
    }
}

