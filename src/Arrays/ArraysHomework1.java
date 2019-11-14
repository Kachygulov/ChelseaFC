package Arrays;

public class ArraysHomework1 {

    public static void main(String[] args) {

        int[] nums={1, 2, 3, 5, 11, 9, 7, 0, 0};

        System.out.println("Array in reverse order: ");

        for (int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

    }

}


