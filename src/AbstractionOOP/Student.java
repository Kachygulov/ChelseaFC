package AbstractionOOP;

public abstract class Student {

    int studentId;
    String studentName;

    public abstract void study();

    abstract void attendClass();

    public void homework(){
        System.out.println("I have to do my homework before coming to class");
    }




}
