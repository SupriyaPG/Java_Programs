package Ass_9th_02_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab067_arraySort {
    public static void main(String[] args) {

        int a[]={12,34,10,1,100,3,4,32};

        System.out.println("Given Array:"+Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Sorted Array:"+Arrays.toString(a));
    }
}
