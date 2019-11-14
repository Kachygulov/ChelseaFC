package IfStatement;

import java.util.Scanner;

public class FalcaoCame {

    public static void main(String[] args) {


        // first Galatasaray should pay 3mil to the Club
        // Gal should pay 5 mil to Falcao

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the Galatasaray Budget");

        int galBudget=input.nextInt();

        System.out.println("Please enter Player Salary");

        int playerSal=input.nextInt();

        if(galBudget==3000000 && playerSal==5000000){

            System.out.println("Falcao can come to the Galatasaray");

        }else{

            System.out.println("Falcao can not come to the Galatasaray");
        }


















    }

















}
