package StringBuilderPractice;

import java.util.Arrays;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder table=new StringBuilder();
        StringBuilder table1=new StringBuilder("Rockwell");

        System.out.println(table);

        table.append("ikea");

        System.out.println(table);

        table.append(10);

        System.out.println(table);

        table1.append(10.4);

        System.out.println(table1);


        StringBuilder computer=new StringBuilder();

        for(char i='a';i<='z';i++){

            computer.append(i);


            StringBuilder tree=new StringBuilder("Oak");

            StringBuilder tree1=new StringBuilder("Oak").append(" 14");

            System.out.println(tree);

            System.out.println(tree1);

            char nm=tree.charAt(0);// --> char

            System.out.println(nm);// O
            System.out.println(tree);// Oakab

            // If you call the method and return type is StringBuilder, in this your original StringBuilder value will change.
            // .append(); --> StringBuilder

            int index=tree.indexOf("ak");

            System.out.println(index);

            int length=tree.length();

            System.out.println(length);

            String subs=tree.substring(1);

            System.out.println(subs);//ak
            System.out.println(tree);//Oak

            // tree1=Oak 14
            String tr=tree1.append("10").append(true).substring(5).substring(1);// 410true

            tree1.append("KKK").append(6.4);

            System.out.println(tree1);//Oak 1410trueK6.4

            System.out.println(tr);









            StringBuilder apple=new StringBuilder("Aple");


            apple.insert(2,"p");

            System.out.println(apple);// Apple

            apple.insert(5,"s number is 10");

            System.out.println(apple);



            StringBuilder [] builders={tree,tree1,computer,apple};

            for(int k=0;i<builders.length;i++){

                builders[i].insert(2,"-");

            }


            System.out.println(Arrays.toString(builders));








        }




    }




}
