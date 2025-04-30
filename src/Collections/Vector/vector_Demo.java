package Collections.Vector;

import java.util.Vector;

public class vector_Demo {

    public static void main(String[] args) {

        //Declaring the vector
        Vector<Integer> v=new Vector<Integer>();

        //appending new element into vector
        for (int i=1;i<5;i++)
            v.add(i);

        //printing elements
        System.out.println(v);

        //remove element at index 2
        v.remove(2);

        //printing elements after remove element
        System.out.println(v);


        //printing elements one by one
        for (int i=0;i<v.size();i++)
            System.out.println(v.get(i)+" ");

    }
}
