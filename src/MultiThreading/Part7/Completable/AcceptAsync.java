package MultiThreading.Part7.Completable;

import java.util.concurrent.*;

public class AcceptAsync {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                    1,1,1,
                    TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
            CompletableFuture<Void> completableFuture=CompletableFuture.supplyAsync(()->
            {
                System.out.println("Thread runs On SupplyAsync.."+Thread.currentThread().getName());
                return "Concept And ";
            },poolExecutor).thenAcceptAsync((String Value)->{
                System.out.println("Task Completed.");
            });


        }
        catch (Exception e){}
    }
}
/*
    Output:
        Thread runs On SupplyAsync..pool-1-thread-1
        Task Completed.

 */

/*
    then Accept and AcceptAsync' method:
        - Generally end of the stage After Completion Of All Taasks.
        -It doesn't  Return Anything.
 */
