package RateLimiter;

import java.util.HashMap;

//Place Where all The Rules Will Be Stored.
public class ThrottleRuleService {
    private static volatile ThrottleRuleService instance;
    HashMap<String, ThrotleRule> clientThrotleRules;

    public ThrottleRuleService() {
        clientThrotleRules = new HashMap<>();
    }

    public void addThrottleRule(String clientId, ThrotleRule rule) {
        clientThrotleRules.put(clientId, rule);
    }
    public ThrotleRule getThrotleRules(String userId){
        return clientThrotleRules.get(userId);
    }

    public static ThrottleRuleService createInstance() {
        if (instance == null) {
            synchronized (ThrottleRuleService.class) {
                if (instance == null) {
                    instance = new ThrottleRuleService();
                }
            }
        }
        return instance;
    }
}
