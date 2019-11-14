package IfStatement;

import java.util.Scanner;

public class CarGear {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter Car Speed");

        int speed=input.nextInt();

        if (speed>=1 && speed<20) {
            System.out.println("The Car Gear is 1");

        }else if(speed>=20 && speed<40) {
            System.out.println("The Car Gear is 2 ");

        } else if(speed>=40 && speed<60) {
            System.out.println("The Car Gear is 3 ");


        } else if(speed>=60 && speed<80) {
            System.out.println("The Car Gear is 4 ");

        }else if(speed>=80 && speed<200) {
            System.out.println("The Car Gear is 5 ");

        }else if(speed<0 && speed>-20) {
            System.out.println("The Car Gear is Rear");

        }else{
            System.out.println("Gear is not defined or speed entered wrong");


        }

    }

}
