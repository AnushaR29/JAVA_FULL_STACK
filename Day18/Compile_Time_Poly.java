package Day18;

public class Compile_Time_Poly {
    public void add (int a, int b)  // method declaration
    { 
        System.out.println(a+b);
    }
    public void add (int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Compile_Time_Poly cp = new Compile_Time_Poly();
        // method call
        cp.add(3, 6); 
        cp.add(4, 7, 8);
    }
}
