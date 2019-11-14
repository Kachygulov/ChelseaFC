package Exceptions;

import java.util.Scanner;

public class RunTimeEx {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 4};

        System.out.println(numbers[2]);
        try {
            System.out.println(numbers[3]);
        } catch (Exception exception) {
            System.out.println("This code throws exception");
        }

        System.out.println(numbers[1]);

        //Arithmetic exception

        Scanner input = new Scanner(System.in);
        System.out.println("Hey enter two numbers you want to divide ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("You can NOT divide by zero");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        System.out.println("Your code is finished");


        String name = null;

        try{
            name.toUpperCase();
        }catch (NullPointerException e){
            System.out.println("It is an Exception");
        }




    }



}
