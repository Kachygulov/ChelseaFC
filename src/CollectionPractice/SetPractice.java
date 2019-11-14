package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {

        Set<Integer>numbers=new HashSet<Integer>();


        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);


        Set<Integer>values=new HashSet<>();

        values.addAll(numbers);

        System.out.println(values);

        Iterator<Integer>iterate=values.iterator();

        while (iterate.hasNext()){

            if(iterate.next()==20){


                System.out.println(iterate.next());

        }


    }


        for(Integer num: values){

            if(num==20){

                System.out.println("This is from the foreach loop " +num);
            }
        }

        System.out.println(values.contains(40));

        System.out.println(values.contains(55));


        values.clear();

        System.out.println("this is after clear method ");

        System.out.println(values);

        System.out.println(values.isEmpty());

        System.out.println(numbers);

        numbers.remove(40);

        System.out.println("This is after remove method" +numbers);
}}
