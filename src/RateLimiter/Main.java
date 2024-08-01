package RateLimiter;

import RateLimiter.Algorithms.RateLimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThrotleRule throtleRule = new ThrotleRule();
        ThrottleRuleService throttleRuleService=ThrottleRuleService.createInstance();
        throttleRuleService.addThrottleRule("Vishnu",throtleRule);
        userIdentificationService request=new userIdentificationService(new RateLimiterService());
        //ExecutorService executors= Executors.newFixedThreadPool(2);
        ScheduledExecutorService scheduledExecutor  =  Executors.newScheduledThreadPool(5);
        Long startTime = System.currentTimeMillis();
        scheduledExecutor.scheduleAtFixedRate(()->{
            System.out.println(" client1 "+Thread.currentThread().getName() + "--" + request.serveRequest("client1"));
        },0, 50,TimeUnit.MILLISECONDS);

        try {
            scheduledExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
            Long endTime = System.currentTimeMillis();
            System.out.println("total time " + (endTime - startTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
