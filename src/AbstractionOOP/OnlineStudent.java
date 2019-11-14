package AbstractionOOP;

public class OnlineStudent extends Student {

    @Override
    public void study() {
        System.out.println("Online student is studying harder than campus student");
    }

    @Override
    void attendClass() {
        System.out.println("They are attending through webinar");

    }
}
