package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String schoolName = "Techtorial Academy 2019 September April";

        String[] words = schoolName.split(" ");

        System.out.println(Arrays.toString(words));

        for (String word : words) {

            if (word.startsWith("A"))

                System.out.println(word);


        }

    }

}
