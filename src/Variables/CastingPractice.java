package Variables;

public class CastingPractice {

    public static void main(String[] args) {

    short samsung=1000;

    short apple=900;

    int totalPrice=(short)(samsung+apple);

    //byte, short, int and long is called integral values
    // float and double is called floating point numbers

    long studentNumber=1200;

    int studentNumber1=(int)studentNumber;

    long num=studentNumber1;

    double st=num;

    double K=800.7d;

    int L=(int)K;

        System.out.println("The L is"+L);


    int x=10;
    int y=5;

        System.out.println(x);

        long l=5;
        int h=8;

        h=(int)l*h; //40

        //differences between 'l*h"and
        //1- if you are using l*h you need to explicitly cast the value
        //2- if you are using h*=l you dont need to cast explicitly

        h*=l;



        byte bookNumber=15;

        int bookPrice=5;

        bookNumber=(byte)(bookNumber*bookPrice);


       // bookNumber*=bookPrice;

        System.out.println(bookNumber);



















    }





}
