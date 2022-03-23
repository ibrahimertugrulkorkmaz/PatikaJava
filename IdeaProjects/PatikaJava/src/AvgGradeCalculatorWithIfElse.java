import java.util.Scanner;

public class AvgGradeCalculatorWithIfElse {
    public static void main(String[] args) {
        int matGrade, fizGrade, trGrade, kimGrade, muzGrade, toplam = 0, counter = 0, avg;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        matGrade = input.nextInt();
        {
            if (matGrade <= 0 || matGrade >= 100)
                System.out.println("Lütfen not değerini 0-100 değerleri arasında giriniz: ");
            else
                toplam += matGrade;
                counter++;
        }


        System.out.print("Fizik notunu giriniz: ");
        fizGrade = input.nextInt();
        if (fizGrade <= 0 || fizGrade >= 100) {
            System.out.println("Lütfen not değerini 0-100 değerleri arasında giriniz: ");
        } else {
            toplam += fizGrade;
            counter++;
        }

        System.out.print("Türkçe notunu giriniz: ");
        trGrade = input.nextInt();
        if (trGrade <= 0 || trGrade >= 100) {
            System.out.println("Lütfen not değerini 0-100 değerleri arasında giriniz: ");
        } else {
            toplam += fizGrade;
            counter++;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimGrade = input.nextInt();
        if (kimGrade <= 0 || kimGrade >= 100) {
            System.out.println("Lütfen not değerini 0-100 değerleri arasında giriniz: ");
        } else {
            toplam += fizGrade;
            counter++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzGrade = input.nextInt();
        if (muzGrade <= 0 || muzGrade >= 100) {
            System.out.println("Lütfen not değerini 0-100 değerleri arasında giriniz: ");
        } else {
            toplam += fizGrade;
            counter++;
        }
        avg = toplam /counter;
        if (avg >=55){
        System.out.println("Tebrikler sınıfı geçtiniz!");}
        else
        {
            System.out.println("Ne yazık ki sınıfta kaldınız.");
        }

        System.out.println("Ortalamanız: " + avg);


    }
}
