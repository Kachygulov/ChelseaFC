package IfStatement;

import java.util.Scanner;

public class MicrophoneFromAmazon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Star Amount : ");
        int star = input.nextInt();
        System.out.println("Please enter Review : ");
        int review = input.nextInt();
        System.out.println("Please enter Price ; ");
        int price = input.nextInt();

        if (star >= 4 && review >= 100 && price < 20) {
            System.out.println("I can buy TONOR");
        } else {
            System.out.println("I can not buy TONOR");


        }


    }}
