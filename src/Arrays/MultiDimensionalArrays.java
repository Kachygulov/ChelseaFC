package Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

   String[][] multiDa={{"aa", "ab"}, {"bb", "ba"}};

        System.out.println(multiDa[0][0]);
        System.out.println(multiDa[0][1]);
        System.out.println(multiDa[1][0]);
        System.out.println(multiDa[1][1]);

        System.out.println("*************************************");

        for (String[] innerArray: multiDa){
            for(String letter: innerArray){
                System.out.println(letter);
            }

        }











    }
}
