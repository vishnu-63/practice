package MultiThreading.ThreadPool;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                2,4,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),new CustomThreadFactory(),
                new CustomRejectionHandler());
        executor.allowCoreThreadTimeOut(true);
        for(int i=1;i<=7;i++){
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                }
                catch (Exception e){}
                System.out.println("Task processed by.."+Thread.currentThread().getName());
            });
        }
        executor.shutdown();

    }

}
class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread th1 = new Thread(r);
        th1.setPriority(Thread.NORM_PRIORITY);
        th1.setDaemon(false);
        return th1;
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejectted "+r.toString());
    }
}

/*
    The concept of pool is all about queues and live in pool and max pool you can conquer
    initially tasks are allotted to the tasks in pool if the pool is full then it adds to the queue and check for the max pool limit if limit persiists then grab a thread and add to the pool ans finally tasks will be rejected if the queue and poolig and max pooling are filled with tasks.
    since it exhausts the capacity
 */

/*
        Task Rejectted java.util.concurrent.FutureTask@4f023edb[Not completed, task = java.util.concurrent.Executors$RunnableAdapter@23fc625e[Wrapped task = MultiThreading.ThreadPool.Main$$Lambda$14/0x000000c001001658@3f99bd52]]
        Task processed by..Thread-0
        Task processed by..Thread-1
        Task processed by..Thread-3
        Task processed by..Thread-2
        Task processed by..Thread-0
        Task processed by..Thread-3
*/