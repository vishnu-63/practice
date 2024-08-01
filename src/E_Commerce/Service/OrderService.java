package E_Commerce.Service;

import E_Commerce.Model.Order;
import E_Commerce.Repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;
    private ProductService productService;
    private PincodeServicabilityService pincodeServiceabilityService;
    private BuyerService buyerService;

    public OrderService(OrderRepository orderRepository, ProductService productService, PincodeServicabilityService pincodeServiceabilityService, BuyerService buyerService) {
    this.orderRepository=orderRepository;
    this.productService=productService;
    this.pincodeServiceabilityService=pincodeServiceabilityService;
    this.buyerService=buyerService;
    }

    public String createOrder(Order order){

        if(productService.getPRoductDetails(order.getProductId())==null){
            throw new RuntimeException("Product Doesn't Exist");
        }
        final String sourcePinCode = productService.getPRoductDetails(order.getProductId()).getAddress().getPincode();

        final String destinationPinCode = buyerService.getBuyer(order.getBuyerId()).getAddress().getPincode();

//        if(!pincodeServiceabilityService.checkIsSourceAndDestPinCodeMatchesForPaymentType(
//                sourcePinCode,
//                destinationPinCode, order.getPaymentMode()
//        )){
//            throw new RuntimeException("Cannot deliver to pincode");
//
//        }
        if(productService.getPRoductDetails(order.getProductId()).getProductQuantity()>=order.getQuantity()){
            Order createdOrder =  orderRepository.createOrder(order);
            System.out.println(createdOrder.getOrderId());
            return createdOrder.getOrderId();
        }

        throw new RuntimeException("Order Creation Failed..");
    }
    public Order getOrderDetails(String orderId){
        return orderRepository.getOderDetails(orderId);
    }
}
