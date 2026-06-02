package threadAndMultithreading;

public class Counter {

    private int count;

    public synchronized void increament(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
