package ForLoop;

import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your balance");

        int balance=input.nextInt();

        int count=1;

        while(balance>0){

            System.out.println("Please input your transaction");
            int transaction=input.nextInt();

            if(balance<transaction){

                System.out.println("Hey, you dont have enough balance");
            }else {
                balance = balance - transaction;

                System.out.println("Your new balance is: " + balance);
            }




        }



    }
}
