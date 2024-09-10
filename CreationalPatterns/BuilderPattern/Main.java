package CreationalPatterns.BuilderPattern;

public class Main {
    public static void main(String args[]){
        Order order = new OrderBuilder(1, 500, 3)  // Required fields
                //.setCustomerName("John Doe")              // Optional fields
                .setAddress("123 Street, City")
                .setPaymentMethod("Credit Card")
                .setDeliveryOptions(2)
                .build();

        order.getOrder();
    }
}



