import java.util.Scanner;

public class PalindromNumberChecker {
    static boolean isPalindrom(int number){
        int temp,reverseNumber=0,lastNumber;
        temp=number;
        while(temp!=0){

            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(reverseNumber==number)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        while(10>5) {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayi giriniz: ");
            int number = input.nextInt();
            if (isPalindrom(number)) {
                System.out.println(number + " sayisi Palindrom'dur.");
            } else
                System.out.println(number + " sayisi Palindrom değildir.");
        }
    }
}
