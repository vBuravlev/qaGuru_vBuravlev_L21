package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:param.properties"
})

public interface BrowserStackConfig extends Config {

    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();

    @Key("app")
    String app();

}