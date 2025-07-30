package Day3;
public class square {
    public static void main(String[] args) {
        int num = 32;
        int b = num%10;
        int a = num/10;
        int bSquare = b*b;
       int ab2 = 2 * a*b;
        int aSquare = a *a;
        if (bSquare>9) {
            int n = bSquare/10;
            ab2 = ab2 + n;
            bSquare = bSquare%10;
            if (ab2>9) {
                int m = ab2/10;
                aSquare = aSquare+m;
                ab2 = ab2%10;
            }

        }
        else if (ab2>9) {
                int m = ab2/10;
                aSquare = aSquare+m;
                ab2 = ab2%10;
            }

        System.out.println(""+ aSquare + ab2 + bSquare);
    }
}