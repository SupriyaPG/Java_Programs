package Array;

public class Lab057_heterogeneousArray {
    public static void main(String[] args) {

        // in heterogeneous array we can store multiple type of data e.g. int, string.float, etc

         //fot that we have to use predefined Object class instead of int / string / float etc

        Object a[]={100,10.5,'A',"Welcome",true}; // declaration of array

        System.out.println("Using enhanced for loop:");
        for(Object x:a)
        {
            System.out.println(x+" ");
        }

        //using normal for loop

        System.out.println("Using normal for loop:");
        for (int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]+" ");
        }

    }
}
