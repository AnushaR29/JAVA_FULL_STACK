import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(2);
        s.push(3);
        s.push(7);
        s.push(5);
        s.push(5);
        s.push(4);

        System.out.println(s);
        System.out.println(s.pop());

    }
}
