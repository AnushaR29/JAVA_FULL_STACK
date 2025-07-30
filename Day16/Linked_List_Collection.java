import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_Collection{
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<>();
        List.add(12);
        List.add(23);
        List.addFirst(1);
        List.addLast(5);

        System.out.println(List);
        System.out.println(List.get(2));
        System.out.println(List.getLast());

        Iterator i = List.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    }
}