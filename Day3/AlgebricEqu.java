package Day3;
public class AlgebricEqu {
    public static void main(String[] args) {
        int num = 16;
        // a2+2ab+b2
        int a = num/10;
        int b = num%10;
        
        int aSquare = a*a;
        int twoAB = 2*a*b;
        int bSquare = b*b;
        
        
    System.out.println(aSquare+ "" + twoAB+"" +bSquare);
    }
}
