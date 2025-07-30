package Day18;

public class Multi_Thread extends Thread{
    public void run(){
        System.out.println("Hi, - "+Multi_Thread.currentThread().getId());
        System.out.println("I am - "+Multi_Thread.currentThread().getId());
        System.out.println("Anusha - "+Multi_Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for(int i = 1;i<=0;i++){
            Multi_Thread mt = new Multi_Thread();
            mt.start();
            try {
                mt.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

