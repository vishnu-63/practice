package Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observer;

import Design_Patterns.Behavioral_Patterns.ObserverDesignPattern.Observerable.Observable;

public class emailAlert implements NotificationAlertObserver {
    String email;
    Observable observable;
    public emailAlert(String email,Observable observable) {
        this.email=email;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMail(email,"Product Back To Stock..");
    }

    public void sendMail(String email,String msg) {

        System.out.println("Sent To:"+email);
        System.out.println(msg);
        System.out.println("Sending this notification Via E-mail,Since You Subscribed..");
    }
}
