package Day18;

public class Polymorphism {
    public static void main(String[] args) {
        Rajesh r = new Rajesh();
        Kanisha k = new Kanisha();
        Anshith a = new Anshith();
        r.Anusha();
        k.Anusha();
        a.Anusha();
    }
}
class Rajesh {
    void Anusha(){
        System.out.println("Daughter");
    }
}
class Kanisha {
    void Anusha(){
        System.out.println("Bestie");
    }
}
class Anshith {
    void Anusha(){
        System.out.println("Sister");
    }
}
