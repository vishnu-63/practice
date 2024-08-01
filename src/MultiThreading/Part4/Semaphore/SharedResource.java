package MultiThreading.Part4.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    Semaphore lock=new Semaphore(2);
    public void produce() {
        try{
            lock.acquire();
            System.out.println("Lock Acquired :"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }
        catch (Exception e) {}
        finally {
            System.out.println("Lock Released :"+Thread.currentThread().getName());
            lock.release();

        }

    }
}
