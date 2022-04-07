public class RepatingEvenNumbers {
    static boolean isFind(int[] array, int value){
        for(int i : array){
            if(i==value)
                return true;
        }
        return false;
    }
    static void repatingNumbers(int [] array){
        int[] dizi=new int[array.length];
        int startIndex=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if((i!=j) && (array[i]== array[j]) && (array[i]%2==0)){
                    if(!isFind(dizi, array[i])){
                    dizi[startIndex++]=array[i];
                }
            }
        }
    }
        System.out.print("Dizi içerisinde tekrarlanan sayilar: ");
        for(int i: dizi){
            if(i!=0)
                System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int[] array= {4,5,13,2,7,5,3,2,9,8,55,43,3,8};
        repatingNumbers(array);
    }
}
