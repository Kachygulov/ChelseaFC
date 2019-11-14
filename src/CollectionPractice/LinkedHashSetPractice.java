package CollectionPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {


        LinkedHashSetPractice numbers=new LinkedHashSetPractice();

        TreeSet<String >eventAttendanceList=new TreeSet<>();

        eventAttendanceList.add("Mike");
        eventAttendanceList.add("Jennifer");
        eventAttendanceList.add("John");
        eventAttendanceList.add("David");

        System.out.println(eventAttendanceList);

        Iterator<String>i=eventAttendanceList.descendingIterator();

        while (i.hasNext()){

            System.out.print(i.next()+" ");
        }

        System.out.println();
        System.out.println(eventAttendanceList);

        eventAttendanceList.pollFirst();

        System.out.println(eventAttendanceList);

        eventAttendanceList.pollLast();

        System.out.println(eventAttendanceList);

    }
}
