package MultiThreading.Part7.Completable;

import java.util.concurrent.*;

public class Combine {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                    1,1,1,
                    TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
            CompletableFuture<Integer> asyncTask1=CompletableFuture.supplyAsync(()->{return 5;},poolExecutor);
            CompletableFuture<String> asyncTask2=CompletableFuture.supplyAsync(()->{return "k";},poolExecutor);
            CompletableFuture<String> combinedAsync=asyncTask1.thenCombine(asyncTask2,(Integer val1,String val2)->{return val1+val2;});
            System.out.println(combinedAsync.get());

        }
        catch (Exception e){}
    }
}
/*
    Output:
        5k
 */

/*
    then combine and combineAsync' method:
        - used to combine the result of 2 comparable future.
 */

