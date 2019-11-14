package CollectionPractice;

import java.awt.*;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {

        TreeMap<String,String> phoneList=new TreeMap<>();

        phoneList.put("Muammer", "12324456468");
        phoneList.put("David", "16576788");
        phoneList.put("Sameer", "5596859869");
        phoneList.put("James", null);

        System.out.println(phoneList);


    }


}
