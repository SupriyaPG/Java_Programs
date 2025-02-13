package Ex06_Array;

import java.util.Arrays;

public class Lab058_reverseAArray {
    public static void main(String[] args) {

        int a[]={5,1,6,8,2,4};

        Arrays.sort(a);
        System.out.println("Sorted Array:"+Arrays.toString(a));

        //Reversing array
        System.out.println("Reverse Array:");
        for(int i=a.length-1;i>0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
