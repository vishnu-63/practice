package MultiThreading.Part9.Schedulung;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRate {
    public static void main(String[] args) {

        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(10);
        Future<?> scheduledObj = poolObj.scheduleAtFixedRate(() -> {
            System.out.println("Thread Picked the Task");
            try {
                Thread.sleep(6000);

            } catch (Exception e) {}
            System.out.println("Scheduling The Task..");
        }, 1, 3, TimeUnit.SECONDS);

//        try {
//            Thread.sleep(10000);
//
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        scheduledObj.cancel(true);
    }
}
/*
    Schedule A Runnable task for repeated Execution At Fixed Rate.
    keeps on executing till memory overflow, or We explicitly Stop the Executor
*/