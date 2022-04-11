public class TransposeOfMatris {
    public static void main(String[] args) {
        int[][] dizi ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}

        };
        //For transpose, we need to create new 2D Array with column & array size swapped
        int row = dizi.length;
        int column= dizi[0].length;
        int[][] transpose = new int[column][row];
        for(int i=0;i<dizi.length;i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                transpose[j][i] = dizi[i][j];
            }
        }
            for (int k=0;k<transpose.length;k++){
                for(int m=0;m<transpose[k].length;m++){
                    System.out.print(transpose[k][m]+" ");
                }
                System.out.println();
            }
        }
    }

