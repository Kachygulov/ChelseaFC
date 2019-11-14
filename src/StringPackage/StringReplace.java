package StringPackage;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {

    String success="dotentimesmore";

    success=success.replace('d','D');

        System.out.println(success);

    success=success.replace("ten","eleven");

        System.out.println(success);

    success=success.replace('m','M');

        System.out.println(success);

     String achievement=" do ten times more ";

     achievement=achievement.trim();

     System.out.println(achievement);


        Scanner input=new Scanner(System.in);

        String value="  Zero To Hero  ";

        System.out.println(value.substring(10));

        String achivement="   Zero To Hero   ";

        achievement=achivement.trim();

        System.out.println(achievement);

        String zerotohero="Zero To Hero";

        zerotohero=zerotohero.replace("Zero","One");

        System.out.println(zerotohero);

        String phrase="zero to hero";

        phrase=phrase.toUpperCase();

        System.out.println(phrase);

        boolean result=value.equalsIgnoreCase("   one to hero   ");

        System.out.println(result);







    }

}
