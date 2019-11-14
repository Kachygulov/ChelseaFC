package Variables;

public class BooleanPractice {

    public static void main(String[] args) {

     boolean isLightOn=true;

     isLightOn=false;

     isLightOn=!true;

        System.out.println(isLightOn);


      int currentSpeed=60;

      int speedLimit=50;

      boolean increaseSpeed=currentSpeed<speedLimit;//true

      boolean decreaseSpeed=currentSpeed>speedLimit;// false

        System.out.println(increaseSpeed);

        System.out.println(decreaseSpeed);


        int currentTemp=60;

        int avarageTemp=72;

        boolean increaseTemp=currentTemp<avarageTemp;
        boolean decreaseTemp=currentTemp>avarageTemp;

        System.out.println("increase temp is "+increaseTemp);
        System.out.println("decrease temp is "+decreaseTemp);


       int personAge=18;

       int legalAge=21;

       boolean sellAlcohol=personAge>=legalAge;
       boolean dontSellAlcohol=personAge<legalAge;

        System.out.println(sellAlcohol);
        System.out.println(dontSellAlcohol);

      int villaPrice=600000;

      int apartmentPrice=500000;

      boolean buyHouse=villaPrice>=apartmentPrice;
      boolean cannotBuyHouse=villaPrice<apartmentPrice;

        System.out.println(buyHouse);
        System.out.println(cannotBuyHouse);











    }
}
