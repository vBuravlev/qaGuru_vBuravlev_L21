package config;

import org.aeonbits.owner.ConfigFactory;

public class SetConfig {

    public static BrowserStackConfig browserStackConfig = ConfigFactory
            .create(BrowserStackConfig.class, System.getProperties());

    public static String getUser() {
        return browserStackConfig.user();
    }

    public static String getKey() {
        return browserStackConfig.key();
    }

    public static String getApp() {
        return browserStackConfig.app();
    }

    public static String getUrl() {
        return browserStackConfig.url();
    }
}
