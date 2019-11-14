package StringPackage;

import java.util.Scanner;

public class StringHomework {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter two business names");

        String real=sc.nextLine();
        String marketing=sc.nextLine();

        boolean equals=real.equalsIgnoreCase(marketing);

        System.out.println(equals);

        boolean firstLetter=real.charAt(0)==marketing.charAt(0);

        System.out.println(firstLetter);











    }
}
