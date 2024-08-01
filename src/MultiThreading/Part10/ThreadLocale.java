package MultiThreading.Part10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocale {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj=new ThreadLocal();
        ExecutorService poolObj= Executors.newFixedThreadPool(5);
        poolObj.submit(()->{
           threadLocalObj.set(Thread.currentThread().getName());
           //Thread Should Be Cleaned After Completed
            threadLocalObj.remove();

        });
        for(int i=1;i<=15;i++){
            poolObj.submit(()->{
                System.out.println(threadLocalObj.get());
            });
        }
    }
}

/*
        Description:
         We have to clean the The Thread after completion of Task
         else LocalThread named thread goes into pool and starts the job and respective name will be printed

 */


/*
    without Cleaning the thread
null
null
null
null
null
null
null
null
null
pool-1-thread-1
null
null
pool-1-thread-1
null
null
*/

/*
After cleaning the Thread..

null
null
null
null
null
null
null
null
null
null
null
null
null
null
null

 */