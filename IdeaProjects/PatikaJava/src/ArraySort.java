import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int arraySize = input.nextInt();
        int[] array=new int[arraySize];
        for(int i=0;i<array.length;i++){
            System.out.println("Dizinin "+(i+1)+". elemanini giriniz: ");
            array[i]= input.nextInt();
        }
        Arrays.sort(array);
        int count=0;
        for(int i:array){
            count++;
            System.out.println("Dizinin "+count+". elemani:" +i);
        }
        System.out.println("Sıralama: "+Arrays.toString(array));
    }
}
