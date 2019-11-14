package ForLoop;

public class NumberTree {

    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            int currentNum = 2 * i - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNum);
                currentNum = currentNum - 2;
            }
            System.out.println();
        }
    }








}
