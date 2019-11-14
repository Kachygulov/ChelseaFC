package IfStatement;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Do you have a passport");

        boolean passport=input.nextBoolean();

        if(passport){

            System.out.println("Do you have a ticket?");

         boolean ticket=input.nextBoolean();

         if (ticket){

             System.out.println("You can come to the US");
         }










        } }}
