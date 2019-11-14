package ForLoop;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number");

        int num= scanner.nextInt();

        String name="*";

        for (int i = 1; i <= num; i++) {
            for (int c = 1; c <= i; c++) {

                System.out.print("* ");


            }
            System.out.println();
        }
    }  }