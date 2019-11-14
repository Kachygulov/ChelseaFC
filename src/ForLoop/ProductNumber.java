package ForLoop;

public class ProductNumber {

    public static void main(String[] args) {

        int number=123456;

        int product=1;

        int sum=0;

        while (number>0){

            System.out.println(number%10);
            product=number/10;
            sum+=number;
            break;

        }

        System.out.println(product);
    }

}
