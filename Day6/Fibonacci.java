package Day6;

class CSE
{
    public class Fibonacci{
       public  static int fibonacci(int n)
    {
        if(n==1 || n==0){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
        public static void main(String[] args) {
        CSE trainer = new CSE();
        int n = 10;
        System.out.println(fibonacci(n));
    }
 }
}
