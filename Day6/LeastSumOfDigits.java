package Day6;

public class LeastSumOfDigits{
    public static void main(String[] args) {
        int day = 45;
        System.out.print((day%9)==0?"":day%9);
        for (int q = day/9; q>0; q--)
        System.out.print(9);
    }
}