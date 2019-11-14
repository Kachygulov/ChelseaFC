package InheritanceOOP;

public class WildAnimal extends animal {

    @Override // Annotation
    public void eat(){

        System.out.println("Wild animal is eating meat");
    }

    @Override
    public  void sleep(){
        System.out.println("Wild animal is not sleeping");
    }

public void fight(){
    System.out.println("Wild animal is fighting");
}


}
