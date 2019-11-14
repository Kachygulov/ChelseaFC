package ConstructorPractice;

public class ComputerTest {

    public static void main(String[] args) {
        Computer c = new Computer();// i called nor argument constructor
        Computer c1 = new Computer("Apple", "OS", "Mackboock", "Pro");
        //Immutable class
        //My instance variables should be private
        // i need to create only getters
        Computer c2 = new Computer(2015, 8, 13);
        //c2.year=2019
        System.out.println(c.getName());
        System.out.println(c.getYear());
        c.setName("HP");
        System.out.println(c.getName());
        c.setName("Asus");
        System.out.println(c.getName());
        System.out.println(c1.getName());
        c1.setName("acer");
        System.out.println(c1.getName());
    }







}














