package InheritanceOOP3;

public class staticBlocks {

    String name;

    public  static final String LEGALSTATUS;

    static {

        LEGALSTATUS="Citizen";
        System.out.println("I am in static block from StaticBlock class");
    }
    {
        System.out.println("I am instance block of StaticBlock class");
    }

    public staticBlocks(){
        System.out.println("I am constructor of staticBlock class");
    }

}
