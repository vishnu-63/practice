package MultiThreading.Part7.Future;

import java.util.concurrent.*;

public class  Main {
    public static  void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Future<?> futureObj=poolExecutor.submit(()->{
            try{
                Thread.sleep(7000);
            }
            catch (Exception e){}
        });
        System.out.println("Is Done.."+futureObj.isDone());
        try {
            futureObj.get(2,TimeUnit.SECONDS);
        }
        catch (TimeoutException e){
            System.out.println("Timeout Exception Happened..");
        }
        catch (Exception e){}

        try {
            futureObj.get();
        }
        catch (Exception e){}
        System.out.println("IS Done.."+futureObj.isDone());
        System.out.println("Is Cancelled.."+ futureObj.isCancelled());
        poolExecutor.shutdown();

    }
}
/*
    The Result of submit method is stored in an Future Object which is an Interface that represents Async Task
    Future Object Allow us to check
        1. whether tha task is completed
        2. Get the Result
        3. Taking Care Of Exception,
 */