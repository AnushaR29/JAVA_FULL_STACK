package Day3;
public class Train {
    public static void main(String[] args) {
        int n = 8;
        int rem = n%8;
        if(rem==1 || rem==4){
            System.out.println("Lower");
        }
        else if (rem==2 || rem==5) System.out.println("Middle");
        else if (rem==3 || rem== 6) System.out.println("Upper");
        else if (rem==7) System.out.println("Side Lower");
        else if (rem==0)System.out.println("Side Upper");
        } 
  }

