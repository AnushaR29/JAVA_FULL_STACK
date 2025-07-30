import java.util.LinkedList;
import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        LinkedList <Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // with size

        // int size = sc.nextInt();
        // int value = sc.nextInt();
        // for(int i = 0;i<size;i++){
        //     l.add(sc.nextInt());
        // }
        // System.out.println(l);

        // System.out.println((l.contains(value)?"Value is presented":"Value is not presented"));

        // without size 

        while (true) { 
            int value = sc.nextInt();
            if(value==-1)
            break;
            l.add(value);
        }
        System.out.println(l);
        int finder = sc.nextInt();

        System.out.println((l.contains(finder)?"Value is presented":"Value is not presented"));
        sc.close();
    }
}
