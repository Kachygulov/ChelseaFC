package InterfaceOOP;

public class Macys implements Store {
    @Override
    public void sellItem() {
        System.out.println("Macys selling shoes");

    }

    @Override
    public int countEmployees() {
        return 250;
    }
}
