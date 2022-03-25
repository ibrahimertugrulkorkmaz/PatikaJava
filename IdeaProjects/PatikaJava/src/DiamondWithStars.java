import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        int boyut;
        Scanner input = new Scanner(System.in);
        System.out.print("Elmasin boyutunu belirtiniz: ");
        boyut = input.nextInt();
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < (boyut - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0;i<=boyut;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print(" ");
            }

            for (int k =1 ; k <2*(boyut-i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        }
    }



