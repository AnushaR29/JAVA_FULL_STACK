package Day5;
public class SafestPlace{

    public static void main (String []args){
        int start = 1;
        int number = 5;
        int binary = 1;
        for ( ;binary<=number; binary<<=1);
        int d = number-binary;
        int ans = (2*(d)+start)%number;
        System.out.println((ans==0)?number:ans);
    }
 }
