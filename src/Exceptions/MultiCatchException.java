package Exceptions;

public class MultiCatchException {

    public static void main(String[] args) {

        String id="23e45g";
        try {
            int idNum = Integer.parseInt(id);
            System.out.println(idNum);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("I am in finally block");
        }

        System.out.println("I am out of try catch block.");
    }
}
