package E_Commerce.Model;

public class PincodeServicalbility {
    private final String destinationPinCode;
    private final PaymentMode paymentMode;

    public PincodeServicalbility(String destinationPinCode, PaymentMode paymentMode) {
        this.destinationPinCode = destinationPinCode;
        this.paymentMode=paymentMode;
    }

    public String getDestinationPinCode() {
        return destinationPinCode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
