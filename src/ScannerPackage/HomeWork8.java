package ScannerPackage;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {
        int internationalCost=5;
        int localCost=3;
        int deposit=100;
        int internationalCalls=deposit/internationalCost;
        int localCalls=deposit/localCost;
        System.out.println("With 100$ deposit I can call "+internationalCalls+" times to international numbers or "+localCalls+" to local numbers");
    }

}
