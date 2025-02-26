//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Inventory Management System
        // Sample testing products
        Product product1 = new Product("Laptop", 1200.0, 20, 5);
        product1.display();

        System.out.println();

        Product product2 = new Product("Smartphone", 800.0, 10, 3);
        product2.display();

        System.out.println();
        // Predict stock depletion
        StockPredictor.predictStock(product1, 4);
        System.out.println();
        StockPredictor.predictStock(product2, 2);

        System.out.println();
        System.out.println();

        // Cloud-Ready Order Processing System
        OrderManger orderManager = new OrderManger();

        // Sample testing order
        Order order1 = new Order("Tahani", product1.getProductId(), 2);

        orderManager.processOrder(order1);
        order1.display();

        System.out.println();

        orderManager.updateStatus(order1.getOrderId(), OrderStatus.SHIPPED);
        order1.display();
    }
}