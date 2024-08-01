package MultiThreading.Part3.Daemon;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        System.out.println("Main Thread Started");
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 calling producer.");
            sharedResource.produce();
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread Finished..");

    }
}
/*
Definition:
    A Daemon thread is created to support the user threads.
    It generallty works in background and terminated if there is no alive threads.
    Garbage collector is one of the example of Daemon thread.
 */


/*
Output:

Main Thread Started
Main Thread Finished..
Thread 1 calling producer.
Lock Acquired..

 */
