import java.util.Scanner;

/*iki dik kenarını kullanıcıdan aldığımız dik üçgenin hipotenüsünü bulduktan sonra üçgenin alanını hesaplayan program*/

public class RightTriangleArea {
    public static void main(String[] args) {
        int kenar1, kenar2,kenar3,u, ucgeninCevresi;
        double ucgeninAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        kenar3 = input.nextInt();

        u= (kenar1+kenar2+kenar3)/2;
        ucgeninCevresi = 2*u;
        System.out.println("Verilen degerlere gore ucgenin çevresi: " + ucgeninCevresi);
        ucgeninAlani = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u*kenar3));
        System.out.println("Verilen degerlere göre ucgenin alani: " + ucgeninAlani);


    }
}
