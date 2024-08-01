package MultiThreading.Part9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ShutDown {
    public static void main(String[] args) {
        ExecutorService poolExecutor=Executors.newFixedThreadPool(5);
        poolExecutor.submit(()->{
            try {
                Thread.sleep(5000);
                System.out.println("Submitted the job");
            }
            catch(Exception e) {}
        });
        poolExecutor.shutdown();


//        poolExecutor.submit(()->{
//            System.out.println("Restart the job");
//        });

    System.out.println("Main Thread Finished task and unblocked Successfully..");
    }

}
/*
    Shutdown() Method is used to terminate the excutor and new tasks won't be accepted
    after shuttingDown and already Submitted Jobs will be processed and won't effect.

 */

/*
    Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task java.util.concurrent.FutureTask@3f99bd52[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@f6f4d33[Wrapped task = MultiThreading.ThreadPool.ShutDown$$Lambda$16/0x0000007001001428@23fc625e]] rejected from java.util.concurrent.ThreadPoolExecutor@4f023edb[Shutting down, pool size = 1, active threads = 1, queued tasks = 0, completed tasks = 0]
	at java.base/java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2065)
	at java.base/java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:833)
	at java.base/java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1365)
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:123)
	at MultiThreading.ThreadPool.ShutDown.main(ShutDown.java:15)
*/