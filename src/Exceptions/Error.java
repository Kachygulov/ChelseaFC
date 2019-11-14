package Exceptions;

public class Error {

    public static void myMethod() {

        // We must not handle ERRORS
        // This is StackOverFlowError

        System.out.println("I am inside of my method");
        myMethod();
    }


    public static void main(String[] args) {
        myMethod();







    }}
