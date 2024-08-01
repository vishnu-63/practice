package Design_Patterns.Behavioral_Patterns.ObserverDesignPattern;

import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;
import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer.SMSAlert;
import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer.emailAlert;
import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable.Observable;
import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable.ObservableImpl;

public class Store{

    public static void main(String[] args) {
        Observable iphpneObserverable=new ObservableImpl();
        NotificationAlertObserver smsObservable=new SMSAlert("9959027237",iphpneObserverable);
        NotificationAlertObserver emailObservable=new emailAlert("vishnu55@gmail.com",iphpneObserverable);
        iphpneObserverable.subscribe(smsObservable);
        iphpneObserverable.subscribe(emailObservable);
        iphpneObserverable.setStockCount(100);
        iphpneObserverable.setStockCount(100);

    }
}
