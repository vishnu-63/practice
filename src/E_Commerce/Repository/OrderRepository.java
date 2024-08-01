package E_Commerce.Repository;

import E_Commerce.Model.Order;

import java.util.HashMap;

public class OrderRepository {
    HashMap<String, Order> orders;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }
    public Order createOrder(Order order){
        if(orders.get(order.getOrderId())!=null){
            throw  new RuntimeException();

        }
        orders.put(order.getOrderId(),order);
        return order;
    }
    public Order getOderDetails(String orderId){
        Order orderDetails=orders.get(orderId);
        return orderDetails;
    }
}
