import java.util.Scanner;
/*Girilen degere gore dairenin çevresi, alanı ve daire diliminin alanını hesaplayan program*/

public class CircleAreaCalculator {
    public static void main(String[] args) {
        int aci;
        double pi=3.14,alan,cevre,yaricap,dilimAlani;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplamak istediginiz dairenin yaricapini giriniz:");
        yaricap = input.nextDouble();
        System.out.print("Daire diliminin aci degerini giriniz: ");
        aci = input.nextInt();

        cevre = 2*pi*yaricap;
        alan = pi*yaricap*yaricap;
        dilimAlani = (pi * (yaricap * yaricap) * aci)/360;
        System.out.println("Girdiginiz yaricap degerine göre dairenin cevresi: "+ cevre);
        System.out.println("Girdiginiz yaricap degerine göre dairenin alanı: "+ alan);
        System.out.println("Girdiginiz aci ve yaricap degerine gore daire diliminin alani: " + dilimAlani);
        
    }
}
