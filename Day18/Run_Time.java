package Day18;

class college { // if the main class is empty it will print the subclass through extends 
    void dept ()
    {
        System.out.println("MEC");
    }
}
public class Run_Time extends college { // while printing first it will print the main class
    void dept()
    {
        System.out.println("\nCSE");
    }
    public static void main(String[] args) {
        Run_Time rp = new Run_Time();
        rp.dept();
    }
}
