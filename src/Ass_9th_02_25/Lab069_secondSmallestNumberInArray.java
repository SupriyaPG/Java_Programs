package Ass_9th_02_25;

import java.util.Arrays;

public class Lab069_secondSmallestNumberInArray {
    public static void main(String[] args) {
        int a[]={11,54,62,78,51,7};
        System.out.println("Given Array"+Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("Sorted Array:"+Arrays.toString(a));
        System.out.println("Second Largest number is:"+a[a.length-2]);
    }
}
