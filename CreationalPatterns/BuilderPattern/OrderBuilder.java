package CreationalPatterns.BuilderPattern;

public class OrderBuilder {
    int orderId;
    int totalAmountOfOrder;
    int numberOfItems;
    //Optional
    String customerName;
    String address;
    String paymentMethod;
    int deliveryOptions;

    // Constructor for required fields
    public OrderBuilder(int orderId, int totalAmountOfOrder, int numberOfItems) {
        this.orderId = orderId;
        this.totalAmountOfOrder = totalAmountOfOrder;
        this.numberOfItems = numberOfItems;
    }
    // Setters for optional fields
    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public OrderBuilder setDeliveryOptions(int deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
        return this;
    }

    // Build method to create the Order object
    public Order build() {
        return new Order(this);
    }
}
