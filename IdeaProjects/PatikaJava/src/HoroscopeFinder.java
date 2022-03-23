import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int gun;
        String ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dogdunuz ayı Turkce karakterler kullanmadan yazınız. Orn: Subat ");
        ay = input.nextLine();
        System.out.print("Lutfen Hangi gun dogdugunuzu yaziniz: ");
        gun = input.nextInt();
        if(ay.equals("Ocak")){
            if(gun<=22){
                System.out.println("Oğlak Burcusunuz");
            }
            else{
                System.out.println("Kova Burcusunuz");
            }
        }

        else if (ay.equals("Subat")){
            if(gun<=19){
                System.out.println("Kova Burcusunuz");
            }
            else{
                System.out.println("Balık Burcusunuz");
            }
        }
        else if (ay.equals("Mart")){
            if(gun<=20){
                System.out.println("Balık Burcusunuz");
            }
            else{
                System.out.println("Koç burcusunuz");
            }
        }
        else if (ay.equals("Nisan")){
            if(gun<=20){
                System.out.println("Koç burcusunuz");
            }
            else {
                System.out.println("Boğa Burcusunuz");
            }
        }
        else if (ay.equals("Mayıs")){
            if(gun<=21){
                System.out.println("Boğa burcusunuz");
            }
            else{
                System.out.println("İkizler burcusunuz");
            }
        }
        else if (ay.equals("Haziran")){
            if(gun<=22){
                System.out.println("İkizler burcusunuz");
            }
            else{
                System.out.println("Yengeç burcusunuz");
            }
        }
        else if (ay.equals("Temmuz")){
            if(gun<=22){
                System.out.println("Yengeç burcusunuz");
            }
            else{
                System.out.println("Aslan burcusunuz");
            }
        }
        else if (ay.equals("Agustos")){
            if(gun<=22){
                System.out.println("Aslan burcusunuz");
            }
            else{
                System.out.println("Başak burcusunuz");
            }
        }
        else if (ay.equals("Eylul")){
            if(gun<=22){
                System.out.println("Başak burcusunuz");
            }
            else{
                System.out.println("Terazi burcusunuz");
            }
        }
        else if (ay.equals("Ekim")){
            if(gun<=22){
                System.out.println("Terazi burcusunuz");
            }
            else{
                System.out.println("Akrep burcusunuz");
            }
        }
        else if (ay.equals("Kasım")){
            if(gun<=21){
                System.out.println("Akrep burcusunuz");
            }
            else{
                System.out.println("Yay burcusunuz");
            }
        }
        else if (ay.equals("Aralık")){
            if(gun<=21){
                System.out.println("Yay burcusunuz");
            }
            else{
                System.out.println("Oğlak burcusunuz");
            }
        }
        else
            System.out.println("Girdiginiz ay tanımlı degildir");



    }
}
