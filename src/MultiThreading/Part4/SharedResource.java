package MultiThreading.Part4;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable=false;
    public void produce(ReentrantLock lock) {
        try{
            System.out.println("Lock Acquired :"+Thread.currentThread().getName());
            lock.lock();
            isAvailable=true;
            Thread.sleep(4000);
        }
        catch (Exception e) {}
        finally {
            lock.unlock();
            System.out.println("Lock Released :"+Thread.currentThread().getName());
        }

    }
}
