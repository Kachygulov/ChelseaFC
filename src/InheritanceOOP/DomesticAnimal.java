package InheritanceOOP;

public class DomesticAnimal extends animal {


    @Override
    public void eat(){
        System.out.println("Domestic animal is eating");
    }

    @Override
    public void run(){
        System.out.println("Domestic animal is running");
    }
    @Override
    public void sleep(){
        System.out.println("Domestic animal is sleeping");
    }



}
