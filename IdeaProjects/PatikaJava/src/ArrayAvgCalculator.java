import java.util.Scanner;

public class ArrayAvgCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int count = 0;
        int toplam = 0;
        System.out.println("Hangi yoldan çözmek istersiniz? 1 mi 2 mi?");
        int choice = input.nextInt();
        if (choice == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
                int eleman = input.nextInt();
                array[i] = eleman;
                toplam += eleman;
                count++;
            }
            System.out.println("Dizinizin ortlaması: " + (toplam / count));
        }

    }
}
