import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print ("Please enter a year which you want to calculate ");
        year = input.nextInt();
        if(year%4==0){
            System.out.println(year+ " year is a leap year");
        }
        else if(year%100==0 && year%400==0){
            System.out.println(year+ "year is a leap year");
        }
        else{
            System.out.println(year+ "year is not a leap year");
        }
    }
}
