package RateLimiter.Algorithms;

import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket  implements RateLimiter{
    private long bucketSize;
    private long refillRate;
    private AtomicLong currentCapacity;
    private AtomicLong lastUpdatedTime;
    public TokenBucket(long bucketSize,long refillRate) {
         this.bucketSize=bucketSize;
         this.refillRate=refillRate;
         currentCapacity=new AtomicLong(bucketSize);
         lastUpdatedTime=new AtomicLong();
    }
    @Override
    public boolean allowRequests() {
        refreshBucket();
        if(currentCapacity.get()>0){
            return true;
        }
        return false;
    }

    private void refreshBucket() {
        long currentTime=System.currentTimeMillis();

        int additionalToken=(int)((currentTime-lastUpdatedTime.get())/1000*refillRate);

        long currCapacity=Math.min(currentCapacity.get()+additionalToken,bucketSize);
        lastUpdatedTime.getAndSet(currentTime);
        currentCapacity.getAndSet(currCapacity);
    }
}
