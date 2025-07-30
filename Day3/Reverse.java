package Day3;
public class Reverse {
    public static void main(String[] args) {
        int num = 1378;
        int rev=0;
        int ans = 0;
         
        while (num>0){
          rev = (rev*10)+(num%10);
          num = (num/10);
        }
       
        while (rev>0){
         ans = (ans*100)+(rev%100);
         rev = (rev/100);
        }
        System.out.println(ans);
    }
}
