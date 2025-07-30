import java.util.*;
public class Array_List_Collection{
    public static void main(String[]args){
        //List
        //ArrayList
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(5);  // to add the elements in the array
        alist.add(3);
        alist.add(7);
        alist.add(8);
        alist.add(1);
        alist.remove(0);  // to remove the elements

        System.out.println(alist); //print the entire list
        System.out.println(alist.get(1)); // prints the specific index 

        Iterator i = alist.iterator();// change the array as string 
        while(i.hasNext()){
        System.out.println(i.next());
        }
    }
}