package WhileLoop;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two number");

        int firstNumber=input.nextInt();

        int secondNumber=input.nextInt();

        while (firstNumber<=secondNumber){

            System.out.println(firstNumber);

            firstNumber++;



        }

    }

}
