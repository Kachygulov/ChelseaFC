package Switch;

import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter state name  ");
        String state = input.nextLine();
        switch (state) {
            case "Illinois":

                System.out.println("Please enter your city");
                String city1 = input.nextLine();
                switch (city1) {
                    case "chicago":
                        System.out.println("welcome to chicago");
                        break;
                    case "elgin":
                        System.out.println("welcome to elgin");
                        break;
                    case "des plaines":
                        System.out.println("welcome to des plaines");
                        break;
                }
                break;
            case "Florida":
                System.out.println("Please enter your city");
                String city2 = input.nextLine();
                switch (city2) {
                    case "Miami":
                        System.out.println("welcome to Miami");
                        break;
                    case "Tampa":
                        System.out.println("welcome to Tampa");
                        break;
                    case "Jacksonville":
                        System.out.println("welcome to Jacksonville");
                        break;
                    default:
                        System.out.println("selected city is not available");
                }
        }
    }

}










