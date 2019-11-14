package StaticPractice;

public class StaticReview {

    static String name;


    {


        System.out.println("this is instance block");
    }

    static {
        System.out.println("this is static block");
    }


    public static void test(){


        //static int number=10;
        System.out.println(name);

        System.out.println("This is static method");
    }

    public void test1(){
        test();
        System.out.println(name);
    }


    public static int add(int a, int b){

        int k=a+b;

        return k;
    }



    public static int substract(int a, int b){

        int k=a-b;

        return k;

    }




    public static int divide(int a, int b){

        int k=a/b;

        return k;


    }


    public static int multiply(int a, int b){

        int k=a*b;

        return k;
    }

}




