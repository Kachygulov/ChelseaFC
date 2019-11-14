package InheritanceOOP3;

public class example extends staticBlocks{

    static {
        System.out.println("I am static block of example class");
    }
    {
        System.out.println("I am instance block of example class");
    }
    {
        System.out.println("I am constructor block of example class");
    }

}
