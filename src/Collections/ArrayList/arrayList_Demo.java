package Collections.ArrayList;

import java.util.ArrayList;
import  java.util.*;
import  java.io.*;


public class arrayList_Demo {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        //ArrayList<String> st=new ArrayList<String>();

        //appending new elements at the end of the list
        for (int i=1;i<=5;i++)
            al.add(i);

        //printing elements
        System.out.println(al);

        //remove element at index 3
        al.remove(3);

        //displaying arrayList after deletion
        System.out.println(al);

        //Printing  elements one by one
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i)+" ");


    }
}
