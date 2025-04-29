package Collections.LinkList;

import java.util.LinkedList;

public class linkedList_Demo {

    public static void main(String[] args) {

        //declaring the LinkedList
        LinkedList<Integer> ll=new LinkedList<Integer>();

        //appending the new elements at the end of LinkedList
        for (int i=1;i<=5;i++)
            ll.add(i);

        //printing elements
        System.out.println(ll);

        //remove  element at index 2
        ll.remove(2);

        //displaying the list after deletion
        System.out.println(ll);

        //printing elements one by one
        for(int i=0;i<ll.size();i++)
            System.out.println(ll.get(i)+" ");


    }
}
