package Arrays;

public class ArraysHomework2 {

    public static void main(String[] args) {

        int[] numbers={1, 2, 3, 5, 11, 9, 0};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }

        System.out.println("Sum of numbers in Array: " + sum);


    }
}
