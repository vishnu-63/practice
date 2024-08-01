package MultiThreading.Part9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {
    public static void main(String[] args) {
        ExecutorService poolExecutor= Executors.newFixedThreadPool(5);
        poolExecutor.submit(()->{
            try {
                System.out.println("Task Execution Start");
                Thread.sleep(5000);
            }
            catch (Exception e) {}
        });
        poolExecutor.shutdown();
        try {
            boolean isterminated=poolExecutor.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Is Thread Got Terminated.. "+isterminated);
        } catch (Exception e) {}
    }

}

/*
    Task Execution Start
    Is Thread Got Terminated.. false

 */

/*
    AwaitTermination is optional And Called After pool has been shutdown which will blocks the Main thread and Wait for Execuot Service and then ShutDown
    AwaitTermination() returns true/false
*/