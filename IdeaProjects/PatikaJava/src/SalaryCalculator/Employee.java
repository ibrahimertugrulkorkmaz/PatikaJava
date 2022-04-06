package SalaryCalculator;


public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double incByYear;

    Employee(String name, int workHours, int hireYear, int salary) {

        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;
        this.tax=0;
        this.bonus=0;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            this.tax = this.salary * 0.03;
            return this.tax;
        }
    }

    public int bonus(){
        if(this.workHours<=40){
            return this.bonus;
        }
        else{
            int workHourseDiff=(this.workHours)-40;
            this.bonus=workHourseDiff*30;
            return this.bonus;
        }
    }

    public double salaryByHireYear(){
        if(this.hireYear>=2012){
            this.incByYear=this.salary*0.05;
            return this.incByYear;
        }
        else if(this.hireYear>2002 && this.hireYear<2012){
            this.incByYear=this.salary*0.10;
        return this.incByYear;}
        else{
            this.incByYear=this.salary*0.15;
            return this.incByYear;
        }

    }

    public String toString(){
        System.out.println("==========================================");
        double brutMaas = this.salary+(salaryByHireYear()+bonus());
        double totalMaas = this.salary+((salaryByHireYear()+bonus())-tax());
        return "Adı: "+this.name+" \nMaaşı: "+this.salary+" \nÇalışma Saati: "+this.workHours+" \nBaşlangıç Yılı: "+this.hireYear+" \nVergi: "+tax()+" \nBonus: "+bonus()+" \nMaaş artışı: "+this.incByYear+" \nBrut Maaş: "+brutMaas+"TL"+"\nVergi ve Bonuslar ile birlikte Maaş: "+totalMaas+"TL";
    }


}
