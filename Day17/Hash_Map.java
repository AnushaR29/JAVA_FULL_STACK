package Day17;

import java.util.*;

public class Hash_Map {
        public static void main(String[] args) {
            Map<Integer,String> hm = new HashMap<>();
            hm.put(1, "Anu");
            hm.put(2, "Kani");
            System.out.println(hm);
            // Iterator it = hm.iterator(hm); // it does not work (iteration,ascending,descending)
            
            // get the particular value
            System.out.println(hm.get(1));

            //whether it is present or not
            System.out.println(hm.containsValue("kani"));
        }   
}
