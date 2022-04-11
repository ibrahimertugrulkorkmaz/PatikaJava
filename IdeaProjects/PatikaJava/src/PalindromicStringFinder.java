import java.util.Scanner;

public class PalindromicStringFinder {
    public static boolean isPalindrome(String word){
        int i=0;
        int j =word.length()-1;
        while(i<j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
            return true;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
}
