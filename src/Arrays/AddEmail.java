package Arrays;

import java.util.Arrays;

public class AddEmail {

    public static void main(String[] args) {

    String names[]={"Lisa", "Kubat", "Kira", "Sema","Erkin"};

    String[] emails=new String[names.length];

    for(int i=0; i<names.length; i++){

        emails[i]=names[i]+"gmail.com";
    }

        System.out.println(Arrays.toString(emails));






    }

}
