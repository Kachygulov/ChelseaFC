package PolymorphismOOP2;

public class woman extends human implements mother{

    @Override
    public void eat(){
        System.out.println("Woman is eating");
    }
    @Override
    public void walk(){
        System.out.println("Woman is walking");
    }

    public void makeUp(){
        System.out.println("Woman is doing make up");
    }

    @Override
    public void takeCare() {
        System.out.println("Mother is taking care of family");

    }
}
