import java.util.Arrays;
import java.util.Scanner;

public class NearestMinMaxValueFinder {
    static void nearest(int[] list,int value){
        Arrays.sort(list);
        for(int i=0;i<list.length;i++){
            if(list[i]>value){
                System.out.println("En yakın büyük değer: "+list[i]);
                System.out.println("En yakın küçük değer: "+list[i-1]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner input = new Scanner(System.in);
        System.out.print("Deger giriniz: ");
        int value = input.nextInt();
        nearest(list,value);

        input.close();
    }
}
