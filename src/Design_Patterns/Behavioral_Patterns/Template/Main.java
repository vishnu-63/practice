package Design_Patterns.Behavioral_Patterns.Template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow merchantPaymentFlow=new userPaymentFlow();
        merchantPaymentFlow.sendMoney();
        System.out.println();
        PaymentFlow userPaymentFlow=new userPaymentFlow();
        userPaymentFlow.sendMoney();
    }
}
