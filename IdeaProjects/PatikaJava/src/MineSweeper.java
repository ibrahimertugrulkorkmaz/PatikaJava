import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public static void main(String[] args) {
        int number = 0, number2 = 0, count = 1;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("On this game, you are deciding size of the game board. Enter row size:");
        int row = input.nextInt();
        System.out.print(" Enter column size: ");
        int col = input.nextInt();
        int element = col * row;
        int mine = element / 4;
        int[][] board = new int[row][col];
        int[] mineArray = new int[mine];
        for (int i = 0; i < mine; i++) {
            number = rand.nextInt(element);
            mineArray[i] = number;
            for (int j = 0; j < board.length; j++) {
                for (int k = 0; k < board[j].length; k++) {
                    count++;
                    if (count == mineArray[i]) {
                        board[j][k] = mineArray[i];
                    } else {
                        number2 = rand.nextInt(3);
                        board[j][k] = number2;
                    }
                }
            }

        }
    }
}
