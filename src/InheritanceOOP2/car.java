package InheritanceOOP2;

public class car extends vehicle {

    public car(){
        super("toyota");
    }

    public car(String make){
        super("Lexus");
    }

    public Integer velocity(){
        return 100;
    }

    public String carName(){
        return "car";
    }











}
