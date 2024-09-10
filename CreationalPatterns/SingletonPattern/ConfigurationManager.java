package CreationalPatterns.SingletonPattern;

/*
Real-Time Scenario: Configuration Manager

Imagine a software application that needs to read configuration settings from a file,
such as database connection details, API keys, or feature flags. These settings should be read once
and used throughout the application to ensure consistency and to avoid multiple reads from the file.

Scenario:

You need a ConfigurationManager class that:

Reads configuration settings from a file or environment variables.
Provides a global access point for the settings.
Ensures that the configuration is loaded only once,
regardless of how many times it's accessed during the application's lifecycle.

*/
public class ConfigurationManager {

    private static ConfigurationManager instance;
    private ConfigurationManager(){
        System.out.println("constructer is called");
    }
    public static synchronized ConfigurationManager getFeature(){
        if(instance==null){
            instance=new ConfigurationManager();
        }
        return instance;
    }

    public void addFeature(String feature){
        System.out.println("Feature added is" +feature);
    }
}
