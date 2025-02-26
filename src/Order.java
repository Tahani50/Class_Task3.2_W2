import java.util.UUID;

enum OrderStatus{PENDING, SHIPPED, DELIVERED;}

public class Order {

    // Class Attributes
    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private OrderStatus orderStatus;


    // Class Constructor
    public Order(String customerName, UUID productId, int quantity) {
        this.orderId = UUID.randomUUID();
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.orderStatus = OrderStatus.PENDING;
    }

    // Class Getters
    public UUID getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public UUID getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    // Class Setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Status: " + orderStatus);
    }
}
