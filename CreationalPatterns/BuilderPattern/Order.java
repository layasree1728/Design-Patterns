package CreationalPatterns.BuilderPattern;

public class Order implements ECommerceApp {
    int orderId;
    int totalAmountOfOrder;
    int numberOfItems;
    //Optional
    String customerName;
    String address;
    String paymentMethod;
    int deliveryOptions;

    public Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.totalAmountOfOrder = builder.totalAmountOfOrder;
        this.numberOfItems = builder.numberOfItems;
        this.customerName = builder.customerName;
        this.address = builder.address;
        this.paymentMethod = builder.paymentMethod;
        this.deliveryOptions = builder.deliveryOptions;
    }

    @Override
    public void getOrder() {
        // Implementation of getOrder
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + totalAmountOfOrder);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Delivery Options: " + deliveryOptions);
    }
}
