package Day18;

public class Thread_Timing {
    public void run (){
        for(int i = 1;i<=5;i++){
            System.err.println(i+ " ");
            try {
                Thread.sleep(20000);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Thread_Timing tm = new Thread_Timing();
        tm.run();
    }
}
