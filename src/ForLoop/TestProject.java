package ForLoop;

public class TestProject {


    public static void main(String[] args) {

        String lettersOccurance= "Techtorial";

        String name="Techtorial";

        // h1e1l3l2o1l1
        // h , 0  , e 1
        // 0+1. 1+1
        name.toLowerCase();

        // get the first char.
        //o

        //
        String result="";
        int count=1;
        for(int i=0;i<name.length();i++){
            char letter = name.charAt(i);
           count=1;
            for(int i1=i+1; i1<name.length()-1; i1++){
                if(name.charAt(i1)==letter){
                    count++;
                }
            }
            result+=letter+""+count;

            name=name.replace(""+name.charAt(i), "");
            i=-1;

        }


        System.out.println(result);
    }
}
