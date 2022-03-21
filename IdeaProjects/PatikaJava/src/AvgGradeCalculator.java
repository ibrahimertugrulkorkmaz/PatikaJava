import java.util.Scanner;

public class AvgGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz ");
        int notMat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz ");
        int notFizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz ");
        int notKimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz ");
        int notTurkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz ");
        int notTarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz ");
        int notMuzik = input.nextInt();

        double Ortalama = (notMat + notFizik + notKimya + notTarih + notTurkce + notMuzik) / 6;
        System.out.print("Not ortalamanız: " + Ortalama);
        String sonuc = (Ortalama>=60) ? " Sınıfı geçtiniz" : " Sınıfta kaldınız";
        System.out.println(sonuc);

        }
    }

