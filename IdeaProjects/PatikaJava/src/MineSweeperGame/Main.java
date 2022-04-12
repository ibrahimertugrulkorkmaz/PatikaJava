package MineSweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your mine sweeper game size by row: ");
        int row = input.nextInt();
        System.out.print("Enter size of your mine sweeper game size by column: ");
        int col = input.nextInt();
        MineSweeper board = new MineSweeper(row,col);
        board.createArray(row,col);
    }
}
