package CollectionPractice;

public class FlowerTest {

    public static void main(String[] args) {

        Flower rose=new Flower("Rose",111111);

        rose.addFlower("Red Rose",12345678);
        rose.addFlower("Blue Rose", 46567567);
        rose.addFlower("Yellow Rose", 38489084);

        int redFlowerBarCode=rose.findFlower("Red Rose");
        System.out.println(redFlowerBarCode);


        String flowerName=rose.findFlower(46567567);
        System.out.println(flowerName);

        rose.printAllFlower();

        rose.removeFlower("Blue Rose");
    }
}
