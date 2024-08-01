package Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable;

import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{

    public List<NotificationAlertObserver> observers=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void subscribe(NotificationAlertObserver obs) {
        observers.add(obs);

    }

    @Override
    public void unsubscribe(NotificationAlertObserver obs) {
        observers.remove(obs);

    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer:observers) {
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStock) {
        if (stockCount==0) {
            notifySubscribers();
        }
        stockCount=stockCount+newStock;

    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
