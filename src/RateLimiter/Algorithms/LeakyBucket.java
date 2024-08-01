package RateLimiter.Algorithms;

import java.util.concurrent.BlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

public class LeakyBucket implements RateLimiter{
    BlockingQueue<Integer> queue;
    public  LeakyBucket(int capacity){
        this.queue=new LinkedBlockingQueue<>(capacity);
    }


    @Override
    public boolean allowRequests() {
        if(queue.remainingCapacity()>0){
            queue.add(1);
            return true;
        }
        return false;
    }
}
