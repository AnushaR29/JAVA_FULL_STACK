package Day17;

import java.util.*;

public class Tree_Set {
    public static void main (String[] args){
        // 1. descending order by default, remove duplicate
        // TreeSet <Integer> ts = new TreeSet<>(Comparator.reverseOrder());

        // 2. descending order, does not remove duplicates 
        // TreeSet <Integer> ts = new TreeSet<>((a,b)->(a<b?1:-1)); ------------ lambda function

        // 3. ascending order, does not remove duplicates
        // TreeSet <Integer> ts = new TreeSet<>((a,b)->(a>b?1:-1)); ------------ lambda function

        // 4. ascending order with removing duplicates
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(7);
        ts.add(1);
        //1. Printing normally with ts
        System.out.println(ts);
        
        //2. adding the data without one by one using iterator, ascending order
        Iterator it1 = ts.iterator(); 
        while(it1.hasNext()) // boolean 
        {
            System.out.print(it1.next()+" ");
        }

        // descending order 
        Iterator it2 = ts.descendingIterator(); 
        while(it2.hasNext()) // boolean 
        {
            System.out.print(it2.next()+" ");
        }

        //3. using for each loop
        for (int i : ts) 
        {
            System.out.print(i+" "); 
        }

        // removes first element
        System.out.print(ts.pollFirst());

        //remove last element
        System.out.print(ts.pollLast());

        //boolean data type (true or false)
        System.out.print(ts.remove(4));


            
    }
}
