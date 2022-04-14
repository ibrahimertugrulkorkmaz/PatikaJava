package MineSweeperGame;

import java.util.Arrays;

public class MineSweeper {

    int row;
    int col;
    int result;
    MineSweeper(int col,int row){
        this.col=col;
        this.row=row;
        this.result=0;
    }

    public  int elements(int this.row,int this.col){
        this.result = (this.row * this.col)/4;
        return this.result;

    }
    public void createArray(int row,int col){

        int[][] array = new int[row][col];
        int[] mine= new int[elements(this.row,this.col)];
        for(int i=0;i<mine.length;i++){

        }

        }



    }






