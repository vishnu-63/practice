package RateLimiter;

public class userIdentificationService {
    RateLimiterService rateLimiterService;
    public userIdentificationService(RateLimiterService rateLimiterService){
        this.rateLimiterService=rateLimiterService;
    }
    public String serveRequest(String userId){
        boolean isAllowed=rateLimiterService.isRateLimitedUserRequest(userId);
        if(isAllowed){
            return "Request served..";
        }
        else {
            return "Too Many Requests please Try Again..";
        }

    }
}
