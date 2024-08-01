package Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable;

import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface Observable {
    void subscribe(NotificationAlertObserver observer);
    void unsubscribe(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newCount);
    int getStock();
}
