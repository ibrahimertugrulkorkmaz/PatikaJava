import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize= input.nextInt();
        int total=0,count=0;
        int[] array = new int[arraySize];
        for (int i=0;i<arraySize;i++){
            array[i]=input.nextInt();
        }

            for(int i=0;i<array.length;i++){
                for (int j=i;j<array.length;j++){
                    total+=array[j];
                    if(total<0){
                        count++;
                    }
                }
                total=0;
            }
            System.out.println(count);
    }
}
