package MultiThreading.Part9.Schedulung;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
    public static void main(String[] args) {
        ScheduledExecutorService poolObj= Executors.newScheduledThreadPool(5);
        poolObj.schedule(()->{
           System.out.println("HELLO..");
        },4, TimeUnit.SECONDS);

        //Calable
        Future<String> result=poolObj.schedule(()->{
            return "Returns Callable..";
        },5, TimeUnit.SECONDS);

        try {
            System.out.println(result.get());
        }
        catch (Exception e){}

    poolObj.shutdown();
    }
}
/*
This Method Will Execute The Task After Delay
 */