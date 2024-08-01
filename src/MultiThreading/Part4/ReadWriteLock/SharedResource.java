package MultiThreading.Part4.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable =false;
    public void read(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Read Lock Acquired :"+Thread.currentThread().getName());
            Thread.sleep(8000);

        }
        catch (Exception e){}
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock Released :"+Thread.currentThread().getName());

        }
    }
    public void write(ReadWriteLock lock){
        try {
            lock.writeLock().lock();
            System.out.println("Write Lock Acquired :"+Thread.currentThread().getName());

        }
        catch (Exception e){}
        finally {
            isAvailable=true;
            lock.writeLock().unlock();
            System.out.println("Write Lock Acquired :"+Thread.currentThread().getName());
        }
    }
}
