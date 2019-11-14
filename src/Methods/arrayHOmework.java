package Methods;

import java.util.Arrays;

public class arrayHOmework {


    public int[] homework(int[] arr){
            int[] result=new int[3];

            Arrays.sort(arr);
            result[0]=arr[0];
            result[1] = arr[arr.length-1];
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum=sum+arr[i];

            }
        int average=sum/arr.length;
            result[2]=average;

            return result;


        }
    }



