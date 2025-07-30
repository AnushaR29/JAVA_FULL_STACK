package Day18;

public class Abstraction extends Mec {
    void rasipuram(){
        System.out.println("College");
    }
    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.rasipuram();
        ab.college();
    }
}
abstract class Mec{
    void college (){
              System.out.println("Mec");
    }   
    abstract void rasipuram(); // abstract method
}

