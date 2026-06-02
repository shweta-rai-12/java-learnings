package threadAndMultithreading;

public class MyThread extends Thread{

    private Counter count;

    public MyThread(Counter count){
        this.count = count;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            count.increament();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
