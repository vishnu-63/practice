package LoggingFrameworkDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
    Map<Integer,List<LogObserver>> logObservers=new HashMap<>();
    void addObserver(int level,LogObserver observer) {
        List<LogObserver> observerList=logObservers.getOrDefault(level,new ArrayList<>());
        observerList.add(observer);
        logObservers.put(level,observerList);
    }

    void notifyAllObeservers(int level,String msg) {

        for(Map.Entry<Integer,List<LogObserver>> entry: logObservers.entrySet()) {
            if(entry.getKey()==level) {
                entry.getValue().forEach(observer -> observer.log(msg));
            }
        }
    }

}
