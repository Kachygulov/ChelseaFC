package StringPackage;

public class StringEqualPractice {

    public static void main(String[] args) {



        String student="David";
        String student1="David";

        String student3="David";

        System.out.println(student==student1);

        String student2=new String("David");

        System.out.println(student==student2);

        student=student2;

        System.out.println(student==student2);


        student1=student1+"";


        System.out.println(student==student3);


    }
}
