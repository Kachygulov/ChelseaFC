package Switch;

import java.util.Scanner;

public class Companies {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the elevetor number");

        int floorNumber=input.nextInt();

        switch (floorNumber){

            case 30:
                System.out.println("Please enter the company name");

                String companyName=input.nextLine();

                switch (companyName){

                    case "Walgreens Corporation":
                        System.out.println("Elevetor Number is one");
                        break;

                    case "CVS":
                        System.out.println("Elevetor Number is two");
                        break;

                    case "Discover":
                        System.out.println("Elevetor Number is three");
                        break;
                    default:
                        System.out.println("Company name is not this floor");








                }





        }



















    }

}
