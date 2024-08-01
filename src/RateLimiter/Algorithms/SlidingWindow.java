package RateLimiter.Algorithms;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements RateLimiter{
    private long bucketSize;
    private long timeframe;
    Queue<Long> slidingWindow;

    public SlidingWindow(long bucketSize, long timeframe) {
        this.bucketSize = bucketSize;
        this.timeframe = timeframe;
        this.slidingWindow=new ConcurrentLinkedQueue<>();
    }


    @Override
    public boolean allowRequests() {
        long currentTime=System.currentTimeMillis();
        checkAndUpdateWindow(currentTime);
        if(slidingWindow.size()<=bucketSize){
            slidingWindow.offer(currentTime);
            return true;
        }
        return false;
    }

    private void checkAndUpdateWindow(long currentTime) {
        if (slidingWindow.isEmpty()) return;
        long calculatedTime=(currentTime-slidingWindow.peek())/1000;
        while(calculatedTime>=timeframe){
            slidingWindow.poll();
            if (slidingWindow.isEmpty()) break;
            calculatedTime=(currentTime-slidingWindow.poll())/1000;
        }
    }
}
