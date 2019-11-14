package Arrays;

import java.util.Scanner;

public class ScoreBoard {

    public static void main(String[] args) {

    char[] teams={'A', 'B', 'C'};

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter score for a team A");
        int scoreA=input.nextInt();
        System.out.println("Please enter score for a team B");
        int scoreB=input.nextInt();
        System.out.println("Please enter score for a team C");
        int scoreC=input.nextInt();
        String scoreA1="";
        String scoreB1="";
        String scoreC1="";
        for(int i=0;i<scoreA;i++){
            scoreA1+="*";
        }System.out.println("Score for team A is "+teams[0]+scoreA1);
        for(int i=0;i<scoreB;i++){
            scoreB1+="*";
        }System.out.println("Score for a team B is "+teams[1]+scoreB1);
        for(int i=0;i<scoreC;i++){
            scoreC1+="*";
        }System.out.println("Score for a team C is "+teams[2]+scoreC1);
    }

}


