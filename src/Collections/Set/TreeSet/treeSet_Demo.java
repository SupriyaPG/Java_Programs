package Collections.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet_Demo {

    public static void main(String[] args) {

        //creating treeset and adding elements

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Sonu");
        ts.add("Monu");
        ts.add("Toni");
        ts.add("Johni");

        //traversing elements
        Iterator<String> itr=ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
