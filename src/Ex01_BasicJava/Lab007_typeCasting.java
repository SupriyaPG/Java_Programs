package Ex01_BasicJava;

public class Lab007_typeCasting {
    public static void main(String[] args)
    {
        /*type casting is when you assign a value of one primitive data type to another type.
        in java there are two types of casting
        1. widening casting(Automatically) converting a smaller type to a larger type size.
        2. Narrowing casting(Manually) converting a larger type to a small size.
        * */
        //Example 1
        int myInt=9;
        double myDouble=myInt; // automatically casting int to double
            System.out.println(myInt);
            System.out.println(myDouble);

            //Example 2

        double myDouble1=9.78d;
        int myInt1=(int) myDouble1;

        System.out.println(myDouble1);
        System.out.println(myInt1);

    }
}
