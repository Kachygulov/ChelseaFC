package AbstractionOOP;

public class TechtorialClass {

    public static void main(String[] args) {

        // we cannot instatied (Create an object)abstract class

        campusStudent cs=new campusStudent();

        cs.attendClass();

        System.out.println("===================");

        OnlineStudent os=new OnlineStudent();
        os.attendClass();
        os.homework();




    }
}
