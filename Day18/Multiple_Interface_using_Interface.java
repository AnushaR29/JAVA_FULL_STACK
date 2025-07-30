package Day18;

public class Multiple_Interface_using_Interface implements parent1,parent2{
    
        public void car(){
            System.out.println("Benz");
        }
        public void bike(){
            System.out.println("NS 200");
        }
        public static void main(String[] args) {
            Multiple_Interface_using_Interface mi = new Multiple_Interface_using_Interface();
            mi.bike();
            mi.car();
    }
}
interface parent1{
    void car();
}
interface parent2{
    void bike();
}
