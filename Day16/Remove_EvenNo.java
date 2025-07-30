import java.util.LinkedList;
import java.util.Scanner;

public class Remove_EvenNo {
    public static void main(String[] args) {
        LinkedList <Integer> l = new LinkedList<>();
        Scanner sc = new Scanner (System.in);

        while (true) { 
            int value = sc.nextInt();
            if(value==-1)
            break;
            l.add(value);
        }
        System.out.println(l);
        int size = (l.size())-1;
        while (size>0) {
            if(l.get(size)%2==0){
                l.remove(size);
                size--;
            }
            size--; 
        }
        System.out.println(l);
    
    }
}
