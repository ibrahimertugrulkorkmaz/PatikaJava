package BoxingGame;

public class Boxer {

    String name;
    String title;
    int boy;
    int kilo;
    int hitChance;
    int strength;
    int hp;
    double damage;

    public Boxer(String name,String title,int boy,int kilo,int hitChance,int strength,int hp){
        this.name=name;
        this.title=title;
        this.boy=boy;
        this.kilo=kilo;
        this.hp=hp;
        this.hitChance=hitChance;
        this.strength=strength;
        this.damage=0;
    }

    void damageCalculation(){
        this.damage=((this.hitChance*0.10)+(this.strength*0.10));
        System.out.println(this.name+"Karakterinin damagei\t"+this.damage);

    }

}
