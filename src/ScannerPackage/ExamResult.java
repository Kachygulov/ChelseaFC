package ScannerPackage;

import java.util.Scanner;

public class ExamResult {

    public static void main(String[] args) {

    // You need to enter 3 different exam result 70, 45, 90
    // if average  is equals to 70 or more than 70
    // Student should attend all the classes true,false
    // Student should complete at least  6 assignment-->5
    // Student is able to go to next semester or not

     Scanner input=new Scanner (System.in) ;

     System.out.println("Please provide exam results");
     int exam1=input.nextInt();
     int exam2=input.nextInt();
     int exam3=input.nextInt();

     int averageScore=(exam1+exam2+exam3)/3;

        System.out.println("Student attendent all the classes");

        boolean attendent=input.nextBoolean();
        System.out.println("Completed Assignment");

        int completedAssignment=input.nextInt();

        boolean result=averageScore>=70&&completedAssignment>=6;

        System.out.println("Can student take classes from next semester?" +result);


























    }
}