package InheritanceOOP;

public class Zoo {

    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal();

        wildAnimal.eat();

        wildAnimal.run();

        System.out.println("=====================");

        animal an=new animal();

        an.sleep();

        an.eat();


        DomesticAnimal domesticAnimal=new DomesticAnimal();

        domesticAnimal.run();

        System.out.println("=========================");

        lion l=new lion();
        l.eat();
        l.fight();
        l.run();


        Dog dog=new Dog();

        dog.eat();

    }

}
