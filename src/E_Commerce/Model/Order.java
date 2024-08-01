package E_Commerce.Model;


import java.util.UUID;

public class Order {
    private  final String orderId;
    private final String productId;
    private final String buyerId;
    private final int quantity;
    private final PaymentMode paymentMode;


    public Order(String productId, String buyerId, int quantity, PaymentMode paymentMode) {
        this.orderId= UUID.randomUUID().toString();
        this.productId = productId;
        this.buyerId = buyerId;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", quantity=" + quantity +
                ", paymentMode=" + paymentMode +
                '}';
    }
}
