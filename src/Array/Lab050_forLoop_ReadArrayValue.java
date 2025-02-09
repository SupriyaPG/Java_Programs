package Array;

public class Lab050_forLoop_ReadArrayValue {
    public static void main(String[] args) {

        //reading array value using for

        int a[]={100,200,300,400,500};
        for (int i=0;i<=a.length-1;i++) //length is 5 but index starts with 0 that's why length-1 ot it can be i<a.legnth don't use =
        {
            System.out.println(a[i]);
        }
    }
}
