package CollectionPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {


        Map<Integer, String> studendList=new LinkedHashMap<>();

        studendList.put(1,"Muammer");
        studendList.put(2,"David");
        studendList.put(3,"John");

        System.out.println(studendList);
    }


}
