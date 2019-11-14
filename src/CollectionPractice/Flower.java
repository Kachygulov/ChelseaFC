package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Flower {

    String names;
    int barcodeNumber;
    HashSet<Flower> flowerList;

    public Flower(String names,int barcodeNumber){
        this.names=names;
        this.barcodeNumber=barcodeNumber;
        flowerList=new HashSet<>();

    }


    public void addFlower(String name,int barcodeNumber){

        flowerList.add(new Flower(name,barcodeNumber));
    }

    public int findFlower(String name){

        for(Flower fl: flowerList){
            if(fl.names.equalsIgnoreCase(name)){
                return fl.barcodeNumber;
            }
        }

        System.out.println("This flower is not available");
       return 0;

    }


    public String findFlower(int barcodeNumber){

        for(Flower fl: flowerList){

            if(fl.barcodeNumber==barcodeNumber){
                System.out.println(fl.names);
                return fl.names;
            }
        }

        System.out.println("This flower is not available");

        return null;

    }

    public void removeFlower(String name){

        ArrayList<Flower> flowersList=new ArrayList<>(flowerList);
        for(int i=0;i<flowerList.size();i++){
            if(flowersList.get(i).names.equalsIgnoreCase(name)){

                flowerList.remove(flowersList.get(i));

            }
        }

        flowerList=new HashSet<>(flowersList);

    }


    public void printAllFlower(){

        for(Flower fl:flowerList){

            System.out.println(fl.names);
        }
    }


}
