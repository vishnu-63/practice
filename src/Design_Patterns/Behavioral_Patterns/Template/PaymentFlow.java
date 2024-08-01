package Design_Patterns.Behavioral_Patterns.Template;

public abstract class PaymentFlow {
    public abstract void createRequest();
    public abstract void calculateFee();
    public abstract void debitAmount();
    public abstract void creditAmount();
    public void sendMoney() {
        createRequest();
        calculateFee();
        debitAmount();
        creditAmount();
    }
}
