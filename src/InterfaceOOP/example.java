package InterfaceOOP;

public class example {

    public static void main(String[] args) {

        bird b=new bird();
        b.makeNoise();
        b.fly();



        plane p=new plane();
        p.fly();
        p.makeNoise();

        Macys macys=new Macys();
        System.out.println(macys.countEmployees());
        macys.displayItem();







    }
}
