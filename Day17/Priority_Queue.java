package Day17;

import java.util.*;

public class Priority_Queue {
    public static void main(String[] args) {
        //min heap 
        PriorityQueue <Integer> max = new PriorityQueue<>();
        max.add(2);
        max.add(4);
        max.add(6);
        max.add(1);
        System.out.println(max);

        //this also can use 
        // Deque<Integer> p = new ArrayDeque<>();

        //max heap
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b)->(a<b)?1:-1);
        min.add(2);
        min.add(4);
        min.add(6);
        min.add(1);
        System.out.println(min);

    }
}
