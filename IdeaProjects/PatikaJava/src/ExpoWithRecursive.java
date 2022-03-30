import java.util.Scanner;

public class ExpoWithRecursive {
    static int expo(int taban,int us){
        int sonuc;
        if(us==0){
            return 1;
        }
        sonuc = expo(taban,(us-1))*taban;
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int taban = input.nextInt();
        System.out.print("Us degeri giriniz: ");
        int us=input.nextInt();
        System.out.println("Sonuc: "+expo(taban,us));
    }
}
