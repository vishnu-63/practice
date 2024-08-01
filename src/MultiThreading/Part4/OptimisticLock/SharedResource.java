package MultiThreading.Part4.OptimisticLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    StampedLock lock=new StampedLock();
    private int a=10;
    public void read(){
        long stamp=lock.tryOptimisticRead();
        System.out.println("Taken Optimistic Read...");
        try {

            a=12;
            Thread.sleep(8000);
            if(lock.validate(stamp)){
                System.out.println("Successfully Updated The Value");
            }
            else {
                System.out.println("Failed to Updated Rolling Back...");
                a=10;
            }
        }
        catch (Exception e){}
    }
    public void write(){
        long stamp=lock.writeLock();
        System.out.println("Acquired Write Lock :"+Thread.currentThread().getName());
        try {
            System.out.println("Performing Work");
            a=9;
        }
        catch (Exception e){}
        finally {
            lock.unlock(stamp);
            System.out.println("Released Write Lock :"+Thread.currentThread().getName());
        }

    }
}
