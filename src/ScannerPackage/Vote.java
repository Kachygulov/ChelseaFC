package ScannerPackage;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        System.out.println("What is your full name ?  ");
        String name=input.nextLine();
        System.out.println("What is your city ? ");
        String city=input.nextLine();
        System.out.println("What is your gender ? ");
        String gender=input.nextLine();
        System.out.println("What is your age ?");

        int age=input.nextInt();

        int l=name.length();


        System.out.println("What is your state code ?");
        String stateCode=input.nextLine();

        boolean ageComp=age>=18;

        System.out.println("Age is over ?"+ageComp);

        boolean firstLet='A'==name.charAt(0);

        System.out.println("firstLet is 'A' " +firstLet);

        boolean lastLet='V'==name.charAt(-1);
        System.out.println("last letter is 'V' ?"+lastLet);
















    }

}
