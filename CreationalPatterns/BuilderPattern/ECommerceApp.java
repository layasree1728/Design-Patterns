package CreationalPatterns.BuilderPattern;
/*  How would you use the Builder pattern in a real-time scenario
where you need to create a complex Order object for an e-commerce application,
 where attributes like customerName, address, items, paymentMethod, and deliveryOptions are optional
 or need to be set conditionally?
 */
public interface ECommerceApp {
    void getOrder();
}
