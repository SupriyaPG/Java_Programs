package Array;

import java.util.Arrays;

public class Lab061_sortingArrayLogically {
    public static void main(String[] args) {
        int a[]={88,54,67,92,34};

        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {

                if(a[i]>a[j])
                {
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
    System.out.print(Arrays.toString(a));
    }
}
