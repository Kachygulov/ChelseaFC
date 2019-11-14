package ConstructorPractice;

public class NumberPractice {

    public int multiply(int num){

        return num*10;
    }



    public double remainder(int value){

        return value%4;
    }

    public static void main(String[] args) {

        int appleNumber=10;


        NumberPractice apple=new NumberPractice();


        apple.multiply(appleNumber);

        System.out.println(appleNumber);

        appleNumber=apple.multiply(appleNumber);

        System.out.println(appleNumber);
    }




}
