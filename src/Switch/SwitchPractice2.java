package Switch;

import java.util.Scanner;

public class SwitchPractice2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String organic=input.nextLine();

        switch (organic){

            case "Strawberry":
                System.out.println("Matching value is Strawberry");
                break;

            case "Cranberry":
                System.out.println("Matching value is Cranberry");
                break;

            case "Chocolate":
                System.out.println("Matching value is Chocolate");
                break;

            case "Banana":
                System.out.println("Matching value is Banana");
                break;

            default:
                System.out.println("The values is not matching with any case statement");
                break;





        }



    }










}
