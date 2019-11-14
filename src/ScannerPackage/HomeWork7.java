package ScannerPackage;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Pen cost");
        int pen=input.nextInt();
        System.out.println("Discount amount");
        int discount=input.nextInt();
        int discountAmount=pen*12/100;
        System.out.println("Discount amount is "+discountAmount);
    }

}
