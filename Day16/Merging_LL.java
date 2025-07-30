
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Merging_LL {
    public static void main(String[] args) {
        LinkedList <Integer> L1 = new LinkedList<>();
        LinkedList <Integer> L2 = new LinkedList<>();
        // LinkedList <Integer> L3 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) { 
            int value = sc.nextInt();
            if(value==-1)
            break;
            L1.add(value);
        }
        while (true) { 
            int value = sc.nextInt();
            if(value==-1)
            break;
            L2.add(value);
        }
        L1.addAll(L2);
        Collections.sort(L1);
        System.out.println(L1);
    }
}
