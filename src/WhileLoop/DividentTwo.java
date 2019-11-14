package WhileLoop;

import java.util.Scanner;

public class DividentTwo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the number");


        int number=input.nextInt();

        int count=0;

        while (number>0){

            number=number/2;
            count=count+number;

        }

        System.out.println(count);






    }











}
