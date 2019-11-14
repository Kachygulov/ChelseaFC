package Arrays;

import java.util.Scanner;

public class Multidimensional {

    public static void main(String[] args) {

        String[][] groupNames={{"Adilet", "Aimira", "Arslan", "Aiturgan", "Akylai"}, {"Nazire","Yasemin", "Vitaliy"}};


            Scanner input=new Scanner(System.in);
            String name=input.next();

            for(int i=0; i<groupNames.length; i++){
                for(int a=0; a<groupNames[i].length; a++){
                    if(groupNames[i][a].equalsIgnoreCase(name)){
                        System.out.println("In array"+i+"In order"+a);
                    }

                }
            }














    }



}

