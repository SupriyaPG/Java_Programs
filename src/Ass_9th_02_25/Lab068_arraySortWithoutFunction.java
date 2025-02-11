package Ass_9th_02_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab068_arraySortWithoutFunction {
    public static void main(String[] args) {

        int a[]={12,34,10,1,100,3,4,32};

        for (int i=0;i<a.length;i++)
        {
            for (int j=i;j< a.length;j++)
            {
                int swap=0;
                if (a[i]>a[j])
                {
                    swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
        System.out.println("Sorted array:"+ Arrays.toString(a));
    }
}
