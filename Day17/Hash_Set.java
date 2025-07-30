package Day17;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {

        // hashset - ascending order
        HashSet<Character> hs = new HashSet<>();

        // //linked hash set - prints the output in order 
        // LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        //adding th elements 
        hs.add('a');
        hs.add('n');
        hs.add('u');
        System.out.println(hs);
        // Iterator it = hs.iterator();
        // while (it.hasNext())
        // {
        //     System.out.print(it.next()+" ");
        // }
        // System.out.println();
        // for(char i : hs)
        // {
        //     System.out.print(i+" ");
        // }
    }
}
