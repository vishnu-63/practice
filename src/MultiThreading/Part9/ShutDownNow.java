package MultiThreading.Part9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownNow {
    public static void main(String[] args) {
        ExecutorService poolExecutor= Executors.newFixedThreadPool(5);
        poolExecutor.submit(()->{
            try {
                Thread.sleep(8000);
            } catch (Exception e) {
                System.out.println("Exception Occurred.. "+e);
            }
        });
        poolExecutor.shutdownNow();
        System.out.println("Main Thread Is Closing..");
    }
}
/*
        poolExecutor.shutdownNow() method will terminate current and remaining Tasks in the queue and Terminate instantly and
        it returns the List of Tasks which are Not Yet Processed.
 */