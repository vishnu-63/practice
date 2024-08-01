package MultiThreading.Part4.OptimisticLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread th1=new Thread(()->{
            resource.read();
        });
        Thread th2=new Thread(()->{
            resource.write();
        });
        th1.start();
        th2.start();

    }
}

/*
    output:
        Taken Optimistic Read...
        Acquired Write Lock :Thread-1
        Performing Work
        Released Write Lock :Thread-1
        Failed to Updated Rolling Back...


*/

/*
    if we comment  this line "th2.start();" then updation will be successful since other thread hasn't updated the value of a
    Hence the output will be

    output:

    Taken Optimistic Read...
    Successfully Updated The Value

*/


/*
Optimistic Read Locks

    This locking mode can be visualised as an “advanced booking attempt” for a read lock – which may or may not be granted.

    The tryOptimisticRead() method returns a stamp only if the lock is not currently held in write mode.

    The validate(long) method returns true if the lock has not been acquired in write mode since obtaining a given stamp.

    However, if the write lock has been acquired since – the optimistic read fails.


 */