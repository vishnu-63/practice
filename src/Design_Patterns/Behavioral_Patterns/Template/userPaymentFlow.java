package Design_Patterns.Behavioral_Patterns.Template;

public class userPaymentFlow extends PaymentFlow{
    @Override
    public void createRequest() {
        System.out.println("Payment Request Initiated from Person-A to person-B");
    }

    @Override
    public void calculateFee() {
        System.out.println("Calculate Transaction Fee.");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debitted Amount From sender-A");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credited Amount To Sender-B");
    }
}
