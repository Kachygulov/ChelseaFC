package DoWhileLoop;

import java.util.Scanner;

public class PrintThree {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number=2;

        String star="*";

        System.out.println("Please enter the Number");

        int num=input.nextInt();

        do {
            System.out.println(star);
            star+=star+"*";
            number--;


        }while (number>=0);

    }
}
