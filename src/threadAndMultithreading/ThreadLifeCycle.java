package threadAndMultithreading;

public class ThreadLifeCycle extends Thread{

    //3. RUNNING
    public void run(){
        System.out.println("I'm Running "+ Thread.currentThread().getName());
        try {
            // SLEEPING
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{

        //1. NEW - Thread
        ThreadLifeCycle t1 = new ThreadLifeCycle();
        System.out.println(t1.getState());

        //2. RUNNABLE
        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(200);
        //TIMED_OUT
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
