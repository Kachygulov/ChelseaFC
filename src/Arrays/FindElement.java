package Arrays;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {

    String[] colors={"Red", "Green", "Black", "White", "Orange"};

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the color");

        String color=input.next();

        int count=0;

        for (String c: colors){

            if(color.equalsIgnoreCase(c)){
                System.out.println("Your color is inside of array.");
                  break;
            }
            count++;
             if(count==colors.length){
                 System.out.println("-1");
             }
            }

        }
}

