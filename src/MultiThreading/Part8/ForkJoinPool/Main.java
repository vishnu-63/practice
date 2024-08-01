package MultiThreading.Part8.ForkJoinPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {


        //Fork-Join Pool

        ForkJoinPool forkJoinPool=ForkJoinPool.commonPool();
        Future<Integer> futureObj=forkJoinPool.submit(new ComputeSumTask(0,20));
        try{
            System.out.println(futureObj.get());
        }
        catch (Exception e) {}

        forkJoinPool.shutdown();

        //Work Stealing Queue

        ComputeSumTask computeSumTask = new ComputeSumTask(0,20);
        int parallelism = ForkJoinPool.getCommonPoolParallelism();
        ForkJoinPool stealer = (ForkJoinPool) Executors.newWorkStealingPool(parallelism);
        System.out.println(stealer.invoke(computeSumTask));
        stealer.shutdown();

    }
}
