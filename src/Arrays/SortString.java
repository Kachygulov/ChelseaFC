package Arrays;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {

      String[] letters={"b", "a", "w", "q", "c", "p"};

        Arrays.sort(letters);

        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.binarySearch(letters, "b"));

    }



}
