package RateLimiter;

import RateLimiter.Algorithms.LeakyBucket;
import RateLimiter.Algorithms.RateLimiter;
import RateLimiter.Algorithms.SlidingWindow;
import RateLimiter.Algorithms.TokenBucket;
import RateLimiter.config;

import java.util.HashMap;

public class RateLimiterService {
    HashMap<String,ThrotleRule> clientRulesCache;
    HashMap<String,RateLimiter> rateLimiterHashMap;
    ThrottleRuleService throttleRuleService;

    public RateLimiterService(){
        this.clientRulesCache=new HashMap<>();
        this.rateLimiterHashMap=new HashMap<>();
        this.throttleRuleService=ThrottleRuleService.createInstance();
    }
    public boolean isRateLimitedUserRequest(String userId) {
        createUserIfNotTheir(userId);
        return rateLimiterHashMap.get(userId).allowRequests();
    }

    private void createUserIfNotTheir(String userId) {
        if(!clientRulesCache.containsKey(userId)){
            ThrotleRule clientRules=throttleRuleService.getThrotleRules(userId);
            clientRulesCache.put(userId,clientRules);
        }
        if(!rateLimiterHashMap.containsKey(userId)){
            ThrotleRule throtleRule=throttleRuleService.getThrotleRules(userId);
            RateLimiter rateLimiter = new SlidingWindow(config.bucketSize,config.refillRate);
            //TokenBucket(throtleRule.getBucketSize(), throtleRule.getRefillRate())
            rateLimiterHashMap.put(userId,rateLimiter);
        }
    }
}
