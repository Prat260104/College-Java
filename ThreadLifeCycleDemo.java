package MultiThreading;

public class ThreadLifeCycleDemo extends Thread {

    public void run() {
        for(int i=0;i<10;i++){
            
            System.out.println("the thread is running...");
        }
    }
        public static void main(String[] args) throws InterruptedException{
            ThreadLifeCycleDemo  t1 = new ThreadLifeCycleDemo ();
            System.out.println("the state of the thread is "+ t1.getState());
            t1.start();
            System.out.println("the state of the thread is "+ t1.getState());
            Thread.sleep(1000); // throws interrupted exception
            System.out.println("the state of the thread is "+ t1.getState());
            t1.join();  // throws interrupted exception
            System.out.println("the state of the thread is "+ t1.getState());
    }
}
