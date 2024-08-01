package MultiThreading.Part4.Semaphore;


import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread t1= new Thread(()->{
            resource.produce();
        });

        Thread t2= new Thread(()->{
            resource.produce();
        });
        Thread t3= new Thread(()->{
            resource.produce();
        });
        Thread t4= new Thread(()->{
            resource.produce();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*
    output
    Lock Acquired :Thread-0
    Lock Acquired :Thread-1
    Lock Released :Thread-0
    Lock Released :Thread-1
    Lock Acquired :Thread-2
    Lock Acquired :Thread-3
    Lock Released :Thread-3
    Lock Released :Thread-2
 */