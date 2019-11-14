package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertionSet {

    public static void main(String[] args) {

        ArrayList<String> singerList=new ArrayList<>();

        singerList.add("Drake");
        singerList.add("Jackson");
        singerList.add("Cardy B");
        singerList.add("Beyonce");
        singerList.add("Drake");

        System.out.println("This is arrayList "+singerList);

        HashSet<String> singerList1=new HashSet<>(singerList);

        System.out.println("This is set "+singerList1);


        singerList=new ArrayList<>(singerList1);

        System.out.println("This is after converting "+singerList);




    }


}
