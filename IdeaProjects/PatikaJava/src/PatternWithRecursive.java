import java.util.Scanner;

public class PatternWithRecursive {
    static void substract (int sayi,int temp){
        System.out.print(temp + " ");
        if(temp<0)
            add(sayi,temp+5);
            else
                substract(sayi,temp-5);


    }
    static void add(int sayi, int temp){
        System.out.print(temp+" ");
        if(sayi==temp){
            return;
        }
        else
            add(sayi,temp+5);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = input.nextInt();
        substract(sayi,sayi);
    }
}
