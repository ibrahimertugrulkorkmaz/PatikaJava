import java.util.Scanner;
public class PerfectNumber {



        public static void main(String[] args) {
            int number, add=0;
            Scanner input=new Scanner(System.in);

            System.out.print("Enter a number: ");
            number=input.nextInt();

            for (int i =1 ; i<=number/2;i++){
                if (number%i==0) add+=i;
            }
            if (add==number){
                System.out.print(add + " your number is a perfect number!.");
            }else{
                System.out.print(add + " your number isn't a perfect number.");
            }

        }
    }

