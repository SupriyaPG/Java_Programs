package Collections.Set.LinkedHashedSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedHashSet_Demo {

    public static void main(String[] args) {

        //creating LinkedHashSet and adding elements

        LinkedHashSet<String> lhs=new LinkedHashSet<String>();

        lhs.add("Sonu");
        lhs.add("Monu");
        lhs.add("Toni");
        lhs.add("Johni");

        //traversing elements
        Iterator<String>  itr=lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
