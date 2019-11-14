package ClassPractice;

public class Cat {


    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;


    public boolean start(){

        isRunning=true;
        return isRunning;
    }

    public boolean stop(){

        isRunning=false;
        return isRunning;
    }

    public void run(String direction){

        System.out.println("The cat direction is"+direction);


    }

    public void catInfo(){

        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Color "+color);
        System.out.println("Kind "+kind);
        System.out.println("Speed "+speed);

        System.out.println("isRunning "+isRunning);

    }

    public void accelerate(int targetSpeed){

        while (speed<=targetSpeed){
            System.out.println(speed);
            speed++;

        }
    }

    public void slowDown(int targetSpeed){

        while(speed>=targetSpeed){

            System.out.println(speed);
            speed--;
        }
    }

    public static void main(String[] args) {

        Cat dodo=new Cat();

        dodo.name="dodo";
        dodo.age=1;
        dodo.color="Red";
        dodo.kind="Scottish";

        dodo.catInfo();

        dodo.start();

        dodo.catInfo();

        dodo.stop();

        dodo.catInfo();

        dodo.accelerate(10);
        System.out.println("********************************");
        dodo.slowDown(5);


    }




}
