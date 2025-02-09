package Array;

public class Lab066_findingSmallestNo {
    public static void main(String[] args) {

        int a[]={88,54,67,92,34};
        int smallest=1;

        for (int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                smallest=a[i];
            }
            else
            {
                smallest=a[i+1];
            }
        }
        System.out.println("Smallest number:"+smallest);
    }
}
