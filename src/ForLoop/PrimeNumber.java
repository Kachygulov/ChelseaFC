package ForLoop;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(" 2 ");

        int count=0;

        for (int i = 3; i < 100; i++) {

            for (int k = 2; k < i; k++) {

                if (i%k==0) {
                  count++;
                }
            }
         if(count>0){
             System.out.println(i+ " Is not prime number");
         }else{
             System.out.println(i + " Is  prime number");
         }
       count=0;

        }


    }
}
