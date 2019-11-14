package ForLoop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number");

        int number=input.nextInt();

        if(number>=10 && number<=40){

            System.out.println(number + " is in the range");

            for (int i=number;i<=40;i++){
                System.out.println(i);

            }

        }else{

            System.out.println(number + " is not in the range");
        }





    }

}
