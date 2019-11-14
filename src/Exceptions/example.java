package Exceptions;

import java.io.IOException;

public class example {

    public static void main(String[] args) throws Exception {

        WebBrowser webBrowser = new WebBrowser();
        webBrowser.sleep(2);

        webBrowser.readFile("src/Exceptions/myFile");
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("There is Exception");
        }

        System.out.println("=======================");
        testNumber(1);
        System.out.println("I am done with main method");

    }

    public static void testNumber(int num) throws Exception {
        if(num<0){
            throw new Exception("Number is negative");

        }

        System.out.println("This number is positive");

    }

    public static void error(){
        throw new java.lang.Error();
    }


}