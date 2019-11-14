package ForLoop;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the total Number which you want to enter ");

        int totalNumber=input.nextInt();

        System.out.println("Please enter number "+totalNumber+" times");

        int firstNumber=input.nextInt();

        for (int i=0;i<totalNumber-1;i++){

            int secondNumber=input.nextInt();

            if (secondNumber>firstNumber){

                firstNumber=secondNumber;
            }




        }


        System.out.println(firstNumber);




    }


}
