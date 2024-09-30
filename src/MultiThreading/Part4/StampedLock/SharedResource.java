package MultiThreading.Part4.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    StampedLock lock=new StampedLock();
    boolean isAvailable=false;
    public void read(){
        long stamp=lock.readLock();
        try {

            System.out.println("Acquired read Lock :"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(8000);
        }
        catch (Exception e){}
        finally {
        lock.unlock(stamp);
        System.out.println("Released Read Lock.."+Thread.currentThread().getName());
        }

    }
    public void write(){
        long stamp=lock.writeLock();
        try {
            isAvailable=false;
            System.out.println("Acquired Write Lock :"+Thread.currentThread().getName());
        }
        catch (Exception e){}
        finally {
            lock.unlock(stamp);
            System.out.println("Released Write Lock :"+Thread.currentThread().getName());
        }
    }
}
