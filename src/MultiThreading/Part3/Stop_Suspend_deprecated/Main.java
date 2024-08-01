package MultiThreading.Part3.Stop_Suspend_deprecated;

import MultiThreading.Part3.Stop_Suspend_deprecated.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 calling producer.");
            sharedResource.produce();
        });
        Thread t2=new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){}
            sharedResource.produce();
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(3000);
        }
        catch (Exception e){}
        t1.suspend(); // It suspends the t1  thread and gets into deadlocK and lock is never released.
        System.out.println("Main Thread Suspended");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){}
        t1.resume(); // It resumes the t1 thread and gets into running state  and lock is  released and the process goes on.
    }
}
