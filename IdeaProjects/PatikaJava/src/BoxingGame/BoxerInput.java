package BoxingGame;


public class BoxerInput {
    public static void main(String[] args) {

        Boxer b1 = new Boxer("Kharmodov","Bone cracker",198,87,75,15,200);
        Boxer b2 = new Boxer("Hadid","Evil prayer",201,89,65,20,200);

        Fight f1= new Fight("Milano Arena","Carlos Antonio de Silva",17.00,b1,b2);


        b1.damageCalculation();
        b2.damageCalculation();

        f1.start(b1,b2);



    }
}
