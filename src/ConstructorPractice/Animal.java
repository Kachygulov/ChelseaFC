package ConstructorPractice;

public class Animal {

  public   String name;

  public int age;

  private String color;

 protected int weight;


  public void eat(){

        System.out.println("Animal is eating");
    }

    private void sleep(){

        System.out.println("Animal is sleeping");
    }

    public static void main(String[] args) {

      Animal animal1=new Animal();
      animal1.sleep();

      animal1.color="Pink";
        System.out.println(animal1.color);

      

  }

}
