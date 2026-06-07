package threadAndMultithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExmaple {
    private static Lock lock = new ReentrantLock();

    public static void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer method is executing...");
            innerMethod();
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public static void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner method is executing...");
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
    static void main() throws InterruptedException {
        Runnable r = () -> outerMethod();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1. join();
        t2.join();
    }
}
