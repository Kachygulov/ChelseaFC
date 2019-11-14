package Variables;

public class LogicalOperators {

    public static void main(String[] args) {

    boolean hasVisa=true;
    boolean hasTicket=true;

    boolean canCome=hasVisa&&hasTicket;

        System.out.println("Can I come to the USA?"+canCome);



    boolean finishedESL=false;
    int toeflScore=78;
    boolean passToefl=toeflScore>=79;


    boolean canGoToCollege=finishedESL || toeflScore>=79;

        System.out.println("Can go to college?"+canGoToCollege);


    int currentMoney=200_000;
    int homePrice=300_000;

    boolean hasMortgage=true;

    boolean hasEnoughMoney=currentMoney>=homePrice;// false

    boolean canBuyHome=hasMortgage || hasEnoughMoney;

        System.out.println("Can I buy the home? "+canBuyHome);

    // I should have driver licence
    // age 16
    // should pass the exam

    int myAge=20;
    int expectedAge=16;

    boolean ageRequirement=myAge>=expectedAge;// true

    int myScore=70;
    int expectedScore=75;

    boolean passExam=myScore>=expectedScore;

    boolean canGetDLicence=ageRequirement && passExam;

        System.out.println("Can i get the driver licence? "+canGetDLicence);






























    }
}
