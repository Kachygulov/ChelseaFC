package InheritanceOOP3;

public class IT extends Company{

    public IT(){
        super("Google");
    }

    @Override
    public Integer employees(){
        return 200;

    }

    @Override
    public String progress(){
        return "In the middle of Project 2";
    }

    @Override
    Boolean hire(){
        return true;
    }





}
