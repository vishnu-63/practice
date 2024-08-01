package Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer;

import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable.Observable;

public class SMSAlert implements NotificationAlertObserver {
    String phoneNumber="";
    Observable observable;
    public SMSAlert(String phoneNumber,Observable observable) {
        this.phoneNumber=phoneNumber;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMsg(phoneNumber,"Product Back To Stock..");
    }
    public void sendMsg(String phoneNumber,String msg) {

        System.out.println("Sent To:"+phoneNumber);
        System.out.println(msg);
        System.out.println("Sending this notification Via SMS,Since You Subscribed..");
    }
}
