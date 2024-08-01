package Design_Patterns.Behavioral_Patterns.Template;

public class MerchantPaymentFlow extends PaymentFlow{
    @Override
    public void createRequest() {
        System.out.println("Requested Initiated To Transfer Funds To Merchant");
    }

    @Override
    public void calculateFee() {
        System.out.println("Calculating Transaction Fee For The Transaction");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount From The Customer");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit  the Amount To the Merchant");
    }
}
