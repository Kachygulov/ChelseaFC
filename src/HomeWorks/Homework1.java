package HomeWorks;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a year you want to know it is a Leap year ? ");

        int year=in.nextInt();

        if (year%100==0){if(year%400==0){
            System.out.println(year+"is a Leap year :)))");}
            else{
            System.out.println(year+"is not Leap year :(((");}}

        else{ if (year%4==0){
            System.out.println(year+"is a Leap year :)))");}
            else{ System.out.println(year+"is not a Leap year :(((");}}


    }

}
