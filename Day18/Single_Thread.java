package Day18;

public class Single_Thread extends Thread{
    public void run(){
        System.out.println("Hi, - "+Single_Thread.currentThread().getId());
        System.out.println("I am - "+Single_Thread.currentThread().getId());
        System.out.println("Anusha - "+Single_Thread.currentThread().getId()+"\n");
    }

    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            Single_Thread st = new Single_Thread();
            st.run();
        }
    }
}
