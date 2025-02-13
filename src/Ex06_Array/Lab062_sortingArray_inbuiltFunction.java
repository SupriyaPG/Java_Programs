package Ex06_Array;
import java.util.Arrays;

public class Lab062_sortingArray_inbuiltFunction {
    public static void main(String[] args) {

        int a[]={400,700,200,100,800};

        /*
        for(int x:a)
        { System.out.println(x)}
        instead of this code we can use following, code one line code
        */
        System.out.println(Arrays.toString(a)); // for just printing array as it is

        //sorting inbuilt function
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); //Printing sorted array


    }
}
