package Methods;

public class PolindromeNumber {

    public boolean isPolindrome(int original){

        int temp=original;

       int reversed=0;

        while (temp>0){

            int remainderOriginal=temp%10;
            reversed=reversed*10+remainderOriginal;

            temp=temp/10;

        }

        if(reversed==original){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        PolindromeNumber palindrome=new PolindromeNumber();

       boolean result= palindrome.isPolindrome(4444);

        System.out.println(result);

    }

}
