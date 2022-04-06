package SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alen Turuncu",45,1991,775);
        Employee e2 = new Employee ("Sevil Yılmaz",35,2005,1200);
        Employee e3 = new Employee("Halit Osman Kılıç",38,1985,1450);

        System.out.println(e1);
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }




}
