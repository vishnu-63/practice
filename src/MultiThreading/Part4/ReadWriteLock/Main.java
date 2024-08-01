package MultiThreading.Part4.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock=new ReentrantReadWriteLock();
        SharedResource resource=new SharedResource();
        Thread t1=new Thread(()->{
            resource.read(lock);
        });
        Thread t2=new Thread(()->{
            resource.read(lock);
        });
        Thread t3=new Thread(()->{
            resource.write(lock);
        });
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
    This Lock Will be used Where read locks are higher.
    Rules:
        Read lock and Write lock which allows a thread to lock the ReadWriteLock either for reading or writing.

        Read lock:
            If there is no thread that has requested the write lock and the lock for writing, then multiple threads can lock the lock for reading.
            It means multiple threads can read the data at the very moment, as long as there’s no thread to write the data or to update the data.
        Write Lock:
            If no threads are writing or reading, only one thread at a moment can lock the lock for writing.
            Other threads have to wait until the lock gets released.
            It means, only one thread can write the data at the very moment, and other threads have to wait.
 */

/*
    Read Lock Acquired :Thread-0
    Read Lock Acquired :Thread-1
    Read Lock Released :Thread-1
    Read Lock Released :Thread-0
    Write Lock Acquired :Thread-2
    Write Lock Acquired :Thread-2
 */