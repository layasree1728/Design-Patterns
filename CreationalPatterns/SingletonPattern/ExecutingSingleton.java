package CreationalPatterns.SingletonPattern;

public class ExecutingSingleton {
    public static void main(String[] args) {
        ConfigurationManager object1=ConfigurationManager.getFeature();
        object1.addFeature("API");
        // Get the same instance of PrinterSpooler
        ConfigurationManager object2 =ConfigurationManager.getFeature();
        object2.addFeature("Invoice");

        // Check if spooler1 and spooler2 are the same instance
        System.out.println(object1== object2);  // Output: true

    }
}
