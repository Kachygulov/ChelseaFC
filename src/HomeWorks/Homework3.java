package HomeWorks;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Provide number of tomatos?");
        int one=input.nextInt();
        System.out.println("Provide number of Cucumber ?");
        int two=input.nextInt();
        System.out.println("Provide number of Carrot?");
        int three=input.nextInt();
        System.out.println("Provide number of Eggplant?");
        int four=input.nextInt();
        int price1=one*1;
        double price2=two*0.50;
        double price3=three*0.25;
        int price4=four*2;
        double total=price1+price2+price3+price4;
        double discountNumber=total*10/100;
        double disc=total-discountNumber;
        if (total>10) {
            System.out.println(" You need to pay ? " +disc);
        } else {
            System.out.println(" dont apply  any discount");


        }

    }

}
