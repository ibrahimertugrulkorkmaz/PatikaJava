import java.sql.SQLOutput;
import java.util.Arrays;

public class RepeatingNumbersCountFinder {
    public static void main(String[] args) {
        int count=0;
        int[] dizi={10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int index= Arrays.binarySearch(dizi,20);
        System.out.println(index);
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if((i!=j) && dizi[i]==dizi[j]){
                    count++;
                }
                if(count!=0){
                    System.out.println(dizi[i]+"sayisi "+count+"kere tekrar etmiştir.");
                    count=0;
                }

            }
        }

    }
}
