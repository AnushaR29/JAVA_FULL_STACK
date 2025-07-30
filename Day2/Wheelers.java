package Day2;

public class Wheelers {
    public static void main(String [] args){
        int w = 100;
        int v = 10;
        int tw =((v*4)-w)/2;
        
        if((w&1)==0 && (w>v) && (w<=v*4)){
            System.out.println("tw " +tw+ " fw "+(v-tw));
        }
        else {
            System.out.println("Invalid");
        }
    }
}