package MultiThreading.Part2;

public class MonitorLock {
    public synchronized void task1() {
        try{
            System.out.println("Performing Task 1");
            Thread.sleep(10000);

        }
        catch (Exception e){}

    }
    public synchronized void task2() {
        System.out.println("Task 2 Outside synchronized");
        synchronized (this){
            System.out.println("Performing Task 2 inside synchronized");
        }

    }

    public  void task3() {
        System.out.println("Performing Task 3");
    }

}
