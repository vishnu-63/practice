package MultiThreading.Part9.Schedulung;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedDelay {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(10);
        poolObj.scheduleWithFixedDelay(() -> {
            System.out.println("Thread Picked the Task");
            try {
                Thread.sleep(6000);

            } catch (Exception e) {
            }
            System.out.println("Scheduling The Task..");
        }, 1, 3, TimeUnit.SECONDS);

    }
}
/*Schedules a Runnable Task for Repeated Execution with a fixed delay (Means Next Task delay Counter Starts only after previous Task Completes)*/