package MultiThreading.Part2;

public class MonitorLockMain {
    public static void main(String[] args) {
        MonitorLock monitorLock=new MonitorLock();
        Thread t1=new Thread(()->{monitorLock.task1();});
        Thread t2=new Thread(()->{monitorLock.task2();});
        Thread t3=new Thread(()->{monitorLock.task3();});
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
    Monitor Lock Helps To Make Sure That only 1 Thread allows inside into the particular section of code
    Be it synchronized block or synchronized method
 */