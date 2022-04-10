import java.util.Arrays;


public class RepeatingNumbersCountFinder {
    static boolean isSame(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        int[] duplicate = new int[list.length];

        int count = 0;
        int startIndex = 0;

        System.out.println("Tekrar edilen sayılar: ");

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (!isSame(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
                count = 0;
            }
        }

    }
}
