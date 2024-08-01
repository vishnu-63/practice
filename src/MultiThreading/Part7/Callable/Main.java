package MultiThreading.Part7.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static  void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(
                3,3,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //Use Case-1
        Future<?> futureObj=poolExecutor.submit(()->{
            System.out.println("IN Runnable...");  //This represents Runnable Interface
        });

        //Use Case-2 where we pass arguement and returns Value
        List<Integer> list=new ArrayList<>();
        Future<List<Integer>> futureObj2=poolExecutor.submit(()->{
            list.add(100);
            System.out.println("Task 2 With Runnamle And Return Object");
        },list);


        //Use Case-3

        Future<List<Integer>> futureObj3=poolExecutor.submit(()->{
            System.out.println("Task-3 With Callable..");
            List<Integer> listObj=new ArrayList<>();
            listObj.add(100);
            return listObj;
        });
        try {
            List<Integer> outputFromObj3=futureObj3.get();
            System.out.println(outputFromObj3);
        }
        catch (Exception e){}
        poolExecutor.shutdown();

    }

}
/*
    The difference between Callable And Runnable
        We cannot return Anything In Runnable But We can  return objects in Callable which is captured by Future Object.
 */

/*
    IN Runnable...
    Task 2 With Runnamle And Return Object
    Task-3 With Callable..
    [100]

 */