package Day4;
public class Multiple11 {
    public static void main(String[] multiples_of_11) {
        int num = 121;
        int firstDigit ,middle, lastDigit;
        firstDigit = num/10;
        firstDigit = firstDigit/10;
         lastDigit = num%10;
         middle = num/10;
        middle = middle%10;  
        int sum1 = lastDigit + middle;  
        int sum2 = middle + firstDigit;
        System.out.printf( "%d%d%d%d",firstDigit ,sum2,sum1,lastDigit);
    }
} 
    

