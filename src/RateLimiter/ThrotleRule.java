package RateLimiter;

public class ThrotleRule {
    long bucketSize;
    long refillRate;

    public ThrotleRule() {
        this.bucketSize = 10;
        this.refillRate = 10;
    }

    public ThrotleRule(int size, int refillRate) {
        this.bucketSize = size;
        this.refillRate = refillRate;
    }

    public long getRefillRate() {
        return refillRate;
    }

    public long getBucketSize() {
        return bucketSize;
    }
}
