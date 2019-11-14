package ForLoop;

public class Homework2 {

    public static void main(String[] args) {

        System.out.println("Divided by 11: ");
        for (int i=100; i<=200; i++) {
            if (i%11==0)
                System.out.print(i +", ");
        }

        int result=0;
        for(int i=100;i<=200;i++){
            if(i%11==0)
                result+=i;
        }

        System.out.println("Expected output is : "+result);
    }
}