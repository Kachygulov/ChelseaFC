package Variables;

import java.awt.*;

public class OperatorPractice {

    public static void main(String[] args) {

       // Re-assigning the variables

        /*
        Variables can be assigned and re-assigned
        many times after declaring
        */

         int apple=10, banana, orange=10;

         banana=12;

         banana=1;

         banana=4;

         System.out.println("Banana number is "+banana);

         banana=8;

         System.out.println("Orange number is"+orange);

         banana=banana+1;

         System.out.println("Banana number is "+banana);

         banana+=1;
         //banana = banana+1;
         //banana=15

        System.out.println("Banana number is "+banana);


        banana*=2;

        System.out.println("Banana number is "+banana);

        orange%=5;
        //orange = orange%5;
        // 5+5+3
        //orange=3

        System.out.println("Orange number is"+orange);

        double taxAmount=10.5;
        float salary=36.7f;
        int number=100;


        //151.2
        double totalAmount=taxAmount+number+salary;

        byte k=10;
        short n=8;

        int totalNumber=k+n;

        //totalNumber=k+n;
        //totalNumber=k*n;
        //totalNumber=k%n;
        // totalNumber=k/n;

        int berry=14;

        System.out.println(berry);

        berry=berry++;

        System.out.println(berry++);

        System.out.println(berry);

        berry=++berry;

        System.out.println(berry);//16







    }




}
