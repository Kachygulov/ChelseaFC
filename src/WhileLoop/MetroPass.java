package WhileLoop;

import java.util.Scanner;

public class MetroPass {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your balance");

       int balance=input.nextInt();

       int count=1;

       while(balance>=2){

           balance=balance-2;

           System.out.println(count+"times card used");
           count++;

       }

    }
}
