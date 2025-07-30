package Day4;


public class ArrayCount {
    public static void main(String[] args) {
        int [] a= {0,0,1,0,1,0};
        int count =0;
        for (int i =0;i<a.length;i++) {
            count=(a[i]==1)?count+1:count-1;  
        }
        System.out.println((count==0)?true:false);
        }
}
