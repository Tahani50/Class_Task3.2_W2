import java.util.*;

public class OrderManger {
    private List<Order> orders = new ArrayList<>();

    public void processOrder(Order order) {
        orders.add(order);
        System.out.println("New Order Placed: " + order);
    }

    public void updateStatus(UUID orderId, OrderStatus newStatus) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                order.setOrderStatus(newStatus);
                System.out.println("Order Updated");
                return;
            }
        }
        System.out.println("Order not found!");
    }
}
