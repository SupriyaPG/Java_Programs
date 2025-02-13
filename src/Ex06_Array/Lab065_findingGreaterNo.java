package Ex06_Array;

public class Lab065_findingGreaterNo {
    public static void main(String[] args) {

        int a[]={54,77,60,34,48};
        int greater=0;
        for (int i=0;i<=a.length-1;i++)
        {
            if(a[i]>greater)
            {
                greater=a[i];
            }
        }
        System.out.println("Greater number is: "+greater);
    }
}
