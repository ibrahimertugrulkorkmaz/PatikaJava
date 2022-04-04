package BoxingGame;


public class Fight {

    Boxer b1;
    Boxer b2;
    String arenaName;
    String refereeName;
    double startTime;
    int damage;

    public Fight(String arenaName,String refereeName,double startTime,Boxer b1,Boxer b2){
        this.arenaName=arenaName;
        this.refereeName=refereeName;
        this.startTime=startTime;
        this.damage=0;
        this.b1=b1;
        this.b2=b2;
    }
    void start(Boxer b1, Boxer b2){
        if(isCheck()){
            System.out.println("Dövüşçülerin kiloları belirtilen aralıkta, başarılı.");
            if(isStart()) {
                while (true) {
                    System.out.println("=======================");
                    this.b1.hp -= this.b2.damage;
                    System.out.println(this.b2.name+" =>"+this.b1.name+"'a"+this.b2.damage+" damage vurdu"+"Kalan Can: "+this.b1.hp);
                    this.b2.hp -= this.b1.damage;
                    System.out.println(this.b1.name+" =>"+this.b2.name+"'a"+this.b1.damage+" damage vurdu"+"Kalan Can: "+this.b2.hp);
                    if (this.b1.hp <= 0) {
                        System.out.println("Kazanan: " + b2.name);
                        break;
                    } else if (this.b2.hp <= 0) {
                        System.out.println("Kazanan: " + b1.name);
                        break;
                    }
                }
            }
            else
                while (true) {
                    System.out.println("=======================");
                    this.b2.hp -= this.b1.damage;
                    System.out.println(this.b1.name+" =>"+this.b2.name+"'a"+this.b1.damage+" damage vurdu"+"Kalan Can: "+this.b2.hp);
                    this.b1.hp -= this.b2.damage;
                    System.out.println(this.b2.name+" =>"+this.b1.name+"'a"+this.b2.damage+" damage vurdu"+"Kalan Can: "+this.b1.hp);
                    if (this.b1.hp <= 0) {
                        System.out.println("Kazanan: " + b2.name);
                        break;
                    } else if (this.b2.hp <= 0) {
                        System.out.println("Kazanan: " + b1.name);
                        break;
                    }
                }

        }
        else
            System.out.println("Kilolar siklet aralığında değil.");
    }

    public boolean isCheck(){
        return((this.b1.kilo >=80 && this.b1.kilo<=100)&&(this.b2.kilo>=80 && this.b2.kilo<=100));
    }

    public boolean isStart(){
        double number = Math.random()*100;
        System.out.println(number);
        if(number==1){
        return true;
        }
        else
            return false;
    }


}
