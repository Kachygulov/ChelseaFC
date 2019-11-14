package ConstructorPractice;

public class SoccerPlayerTest {

    public static void main(String[] args) {

        SoccerPlayer player=new SoccerPlayer();
        player.name="Ronaldo";

        player.age=34;
        player.national="Portugal";
        player.teamName="Juventus";
        player.height=6.1;
        player.weight=93.1;
        player.run();//1
        player.run(player.name);// 2 3
        player.shoot(60,28);








    }

}


