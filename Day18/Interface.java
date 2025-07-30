package Day18;

public class Interface implements mec {
    public void college (){
        System.out.println("Student");
    }
    public static void main(String[] args) {
        Interface it = new Interface();
        it.college();
    }
    
}
interface mec{
    void college ();
}
