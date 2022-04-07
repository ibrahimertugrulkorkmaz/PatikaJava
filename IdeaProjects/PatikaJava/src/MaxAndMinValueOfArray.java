import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinValueOfArray {

    static void minmax(int[] list) {
        int enBuyukDeger = list[0], enKucukDeger = list[0];
        for (int i = 1; i < list.length; i++) {

            if (list[i] > enBuyukDeger) {
                enBuyukDeger = list[i];
            } else if (list[i] < enKucukDeger) {
                enKucukDeger = list[i];
            }
        }
        System.out.println("Dizinin en buyuk degeri: " + enBuyukDeger + "\n Dizini en kucuk degeri: " + enKucukDeger);
    }

    static void minmax1(int[] list) {
        Arrays.sort(list);
        System.out.println("Dizinin en kucuk degeri: " + list[0] + "\nDizinin en büyük değeri: " + list[list.length - 1]);
    }


    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi yöntem ile çözmek istersiniz? \n1)Karşılaştırmalı olarak \n2)Sıralandıktan sonra indexleri alarak ");
        int choice = input.nextInt();
        if (choice == 1) {
            minmax(list);
        } else if(choice==2) {
            minmax1(list);
        }

    }
}
