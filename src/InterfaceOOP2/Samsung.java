package InterfaceOOP2;

public class Samsung extends CellPhone
{
    @Override
    public void call() {
        System.out.println("Samsung is calling");

    }

    @Override
    public void text() {
        System.out.println("Samsung is texting");

    }

    @Override
    public void takePicture() {
        System.out.println("Samsung is taking picture");

    }

    @Override
    public void location() {
        System.out.println("Samsung has flash card");


    }

    @Override
    public void faceId() {
        System.out.println("Samsung has faceId function");

    }
}
