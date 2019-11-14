package StaticPractice;

import java.awt.*;
import java.util.ArrayList;

import static StaticPractice.StaticReview.test;

import static StaticPractice.StaticReview.*;

import static java.lang.Math.addExact;

import static StaticPractice.StaticReview.substract;

import static StaticPractice.StaticReview.divide;

import static StaticPractice.StaticReview.multiply;

public class StaticTest {

    public static void main(String[] args) {

        StaticReview rev=new StaticReview();

        StaticReview rev1=new StaticReview();

        StaticReview.test();

        rev.test1();

        test();


        System.out.println( addExact(10,-5));


        System.out.println(substract(10,6));


        System.out.println(divide(20,4));


        System.out.println(multiply(4,7));











    }




}
