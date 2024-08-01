package MultiThreading.Part7.Completable;

import java.util.concurrent.*;

public class ApplyAsync {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                    1,1,1,
                    TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
            CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->
                {
                    System.out.println("Thread runs On SupplyAsync.."+Thread.currentThread().getName());
                    return "Concept And ";
                },poolExecutor);
            System.out.println(completableFuture.get());
           completableFuture.thenApplyAsync((String val)->{
               System.out.println("Thread Which Applies and ThenApplyAsync.."+Thread.currentThread().getName());
               return val+"And";
           },poolExecutor);

        System.out.println("Thread After CF.."+Thread.currentThread().getName());
        }
        catch (Exception e){}
}
}
/*
    Thread runs On SupplyAsync..pool-1-thread-1
    Concept And
    Thread After CF..main
    if we haven't speccify executor then default will be fork pool
        i.e. Thread Which Applies and ThenApplyAsync..ForkJoinPool.commonPool-worker-1
    else
        Thread Which Applies and ThenApplyAsync..pool-1-thread-1

 */

/*
    then Apply' method:
        - Its a Synchronous execution.
        - Means, it uses same thread which completed the previous Async task.
    thenApplyAsync' method:
        -Its a Asynchronous execution.
        -Means, it uses different thread (from 'fork-join' pool, if we do not provide the executor in the method), to
        complete this function.
        - If Multiple 'thenApplyAsync' is used, ordering can not be guarantee,they will run concurrently.
 */