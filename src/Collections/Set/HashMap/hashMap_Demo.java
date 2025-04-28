package Collections.Set.HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap_Demo {

    public static void main(String[] args) {

        //creating and adding elements in a HAshmap
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Sonu");
        hm.put(2,"Monu");
        hm.put(3,"Toni");

        //finding value for key
        System.out.println("Value for 1 is: "+hm.get(1));

        //traversing through the Hashmap
        for (Map.Entry<Integer,String> e:hm.entrySet())
            System.out.println(e.getKey()+" " +e.getValue());
    }
}
