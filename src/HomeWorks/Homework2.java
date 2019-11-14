package HomeWorks;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Provide age?");
        int age = input.nextInt();
        System.out.println("Provide city?");
        String city = input.next();
        System.out.println("Provide average Score?");
        int averageScore = input.nextInt();
        System.out.println("Provide citizenship");
        String citizenship = input.next();
        boolean cityCondition;
        if (city.equalsIgnoreCase("Schaumburg")) {
            cityCondition = true;
        } else {
            cityCondition = false;
        }
        boolean citizenshipCondition;
        if (citizenship.equalsIgnoreCase("Yes")) {
            citizenshipCondition = true;
        } else {
            citizenshipCondition = false;
        }
        if (age > 14 && cityCondition == true && averageScore >= 75 && citizenshipCondition == true) {
            System.out.println("Student cannot attent the class ");
        } else {
            System.out.println(" Student can attent the class");


        }

    }
}