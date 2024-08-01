package MultiThreading.Part7.Completable;

import java.util.concurrent.*;

public class ComposeAsync {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                    1, 1, 1,
                    TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() ->
                    {
                        System.out.println("Thread runs On SupplyAsync.." + Thread.currentThread().getName());
                        return "Concept And ";
                    }, poolExecutor)
                    .thenComposeAsync((String val) -> {
                        return CompletableFuture.supplyAsync(() -> {
                            return val + " Coding";
                        });
                    }, poolExecutor);
            System.out.println(completableFuture.get());


        } catch (Exception e) {
        }
    }
}
/*
    Output:
        Thread runs On SupplyAsync..pool-1-thread-1
         Concept And  Coding

 */



/*
    definition:
    then Compose' method and thenComposeAsync' method::
        - Chaining together Async operations
        -Next task will be depends on previous Task returned and we can tie them together.
        - order of Tasks Will Be maintained

 */