package Design_Patterns.Behavioral_Patterns.Mediator;

public interface Colleague {
    void placeBid(int bitAmount);
    void recieveBidNotificaton(int bitAmount);
    String getName();
}
