package IfStatement;

import java.util.Scanner;

public class CarSpeed {

    public static void main(String[] args) {


        // using Scanner enter three different input
        // 1- gasPedal -- true/false
        // 2- breakPedal -- true/false
        // 3- gasPedalPersentage -- number
        // 4- enter current speed
        // 5- enter speed limit

        //IncreaseSpeed= cs<sl, gas pedal equals true,gasPedalPersentage more than 20 percent
        //breakPedal should be false

        Scanner input=new Scanner(System.in);
        System.out.println("Please provide the current speed");
        int currentSpeed=input.nextInt();
        System.out.println("Please provide the speed limit");
        int speedLimit=input.nextInt();
        System.out.println("Please provide the Gas Pedal");
        boolean gasPedal=input.nextBoolean();
        System.out.println("Please provide the Break Pedal");
        boolean breakPedal=input.nextBoolean();
        System.out.println("Please provide the Gas Pedal Percentage");
        int gasPedalPercentage=input.nextInt();
        boolean increaseSpeed=currentSpeed<speedLimit && gasPedalPercentage>20 &&
                gasPedal==true && breakPedal==false;
        System.out.println("Can I increase the speed? "+increaseSpeed);
        // percentage=20  --> it will stay same speed
        // percentage<20  --> decrease speed
        // percentage>20  --> increase speed






    }



}

