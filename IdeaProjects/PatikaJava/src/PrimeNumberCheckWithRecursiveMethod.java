import java.util.Scanner;

public class PrimeNumberCheckWithRecursiveMethod {
    static boolean isPrimeNumber(int n, int i ){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrimeNumber(n, i + 1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        sayi=input.nextInt();
        if (isPrimeNumber(sayi, 2))
            System.out.println(sayi + " Asal sayıdır");
        else
            System.out.println(sayi + " Asal sayi değildir");

        input.close();
    }
}