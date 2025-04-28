package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet_Demo {

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();

        hs.add("Sonu");
        hs.add("Monu");
        hs.add("Toni");
        hs.add("Johni");
        hs.add("Sonu");

        //traversing elemnts
        Iterator<String> itr=hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
