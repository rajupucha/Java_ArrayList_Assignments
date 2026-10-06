import java.util.ArrayList;

class Order {
    private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() { return orderId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setOrderId(int orderId) { this.orderId = orderId; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
}

public class Assignment6_OnlineOrderManagementSystem {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1001, "Laptop", 1, 55000));
        orders.add(new Order(1002, "Mouse", 2, 800));
        orders.add(new Order(1003, "Keyboard", 1, 1500));
        orders.add(new Order(1004, "Monitor", 1, 12000));
        orders.add(new Order(1005, "Headphones", 2, 2500));
        orders.add(new Order(1006, "Printer", 1, 9000));

        orders.add(4, new Order(1007, "Webcam", 1, 3000));
        orders.set(2, new Order(1008, "Tablet", 1, 18000));
        orders.remove(orders.size() - 1);

        Order order = orders.get(3);
        System.out.println("Order at index 3:");
        printOrder(order);

        System.out.println("\\nAll Order Details:");
        for (Order o : orders) {
            printOrder(o);
            System.out.println("---------------------------");
        }

        System.out.println("Total Orders: " + orders.size());
        orders.clear();
        System.out.println("Is Order List Empty? " + orders.isEmpty());
    }

    private static void printOrder(Order order) {
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Product Name: " + order.getProductName());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Price: " + order.getPrice());
    }
}
