package MultiThreading.Part3.Join;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 calling producer.");
            sharedResource.produce();
        });

        t1.start();
        try {
            t1.join(); //Join() method is used to  ensure the other Threads not to run till The current thread completes..
        }
        catch (Exception e){}
        System.out.println("Main Thread Finished.");
    }
}
/*
Thread 1 calling producer.
Lock Acquired..
Lock Released..
Main Thread Finished.
 */