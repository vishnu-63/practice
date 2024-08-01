package MultiThreading.Part4.StampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread th1=new Thread(()->{
            resource.read();
        });
        Thread th2=new Thread(()->{
            resource.read();
        });
        Thread th3=new Thread(()->{
            resource.write();
        });
        th1.start();
        th2.start();
        th3.start();
    }
}

/*
    output:
        Acquired read Lock :Thread-1
        Acquired read Lock :Thread-0
        Acquired Write Lock :Thread-2
        Released Read Lock..Thread-0
        Released Read Lock..Thread-1
        Released Write Lock :Thread-2
 */
