package ForLoop;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        {
            int i, n, sum = 0;

            System.out.print("Input number of terms is: ");
            {
                Scanner input = new Scanner(System.in);

                n=input.nextInt();

                System.out.println("The square natural up to  terms are :");

                for(i=1;i<=n;i++){

                    System.out.println(i*i);

                    sum+=i*i;

                }

                System.out.println("The Sum Squrare Natural Number up to " +n+" terms is: " +sum);
            }


        }
    }
}