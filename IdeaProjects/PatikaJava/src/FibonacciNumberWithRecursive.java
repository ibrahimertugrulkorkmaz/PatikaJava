import java.util.Scanner;

public class FibonacciNumberWithRecursive {
    static int fibonacci(int sayi){
         if(sayi==1 || sayi==2){
             return 1;
         }
             return fibonacci(sayi-1)+ fibonacci(sayi-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci degerinin kacinci elemanını bulmak istiyorsunuz? ");
        int sayi = input.nextInt();
        System.out.println(fibonacci(sayi));
    }
}
