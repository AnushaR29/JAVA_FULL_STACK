public class Method {

    //with return type with args
    public static int add(int a, int b){
        return a+b;
    }

    //without return type with args
    public static void sub (int a ,int b){
        System.out.println(a-b);
    }

    //with return type without args
    public static int mul (){
        int a=10;
        int b =20;
        return a*b;
    }
    public static void div(int a ,int b) {
        System.out.println(a/b);
    }
    
    //without return type without args
    public static void modulus(){
        System.out.println("Modulus");
    }
    
    public static void main(String[] args) {

        System.out.println(add(10,20));  
        sub(10, 5);
        System.out.println(mul());
        mul();
        div(50, 10);
        modulus();
    }
}
