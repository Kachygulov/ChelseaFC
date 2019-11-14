package ConstructorPractice;

public class SoccerPlayer {


    //  name, age, nationality, teamName, height, weight
    String name;
    int age;
    String national;
    String teamName;
    double height;
    double weight;
    public SoccerPlayer(){
    }
    public void run(){
        System.out.println("The soccer player is running");
    }
    public void run(String name){
        run();
        System.out.println(name+" is running");
    }
    public void shoot(){
        System.out.println("The soccerplayer is kicking the ball");
    }
    public void shoot(int speed){
        shoot();
        System.out.println("The speed of the shoot is "+speed);
    }
    public void shoot(int speed, int distance){
        shoot(speed);
        if(speed>50 && distance<25){
            System.out.println("it is goal");
        }else{
            System.out.println("It is not goal");
        }
    }



}
