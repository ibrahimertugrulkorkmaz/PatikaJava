import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {
        int distance;
        double kmPrice=0.10,firstPrice=0,lastPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceginiz mesafeyi km cinsinden yazınız: ");
        distance = input.nextInt();
        if(distance<=0){
            System.out.println("Km değeri sıfırdan küçük olamaz");
        }
        System.out.print("Tek Yon mu yoksa Gidis-Donus mu?\n Tek Yon için: 1 \n Gidis-Donus için 2'ye basınız: ");
        int tripCheck = input.nextInt();
        if(tripCheck==1){
            firstPrice = kmPrice*distance;
        }
        else if(tripCheck==2){
            firstPrice = (kmPrice*distance)*0.80;
        }
        else{
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);

        }

        System.out.println("Kac yasindasiniz?");
        int passAge= input.nextInt();
        input.close();
        if(passAge<=12){
            lastPrice=firstPrice*0.50;
        }
        else if(passAge>=12 && passAge<=24){
            lastPrice=firstPrice*0.90;
        }
        else{
            lastPrice=firstPrice*0.70;
        }

        System.out.println("Toplam Tutar= "+lastPrice+ "TL'dir");



    }
}
