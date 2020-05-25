package infrastructure;

import infrastructure.config.ConfigurationManager;

public class TestServer {


public String getUrl(){


    String testEnv = ConfigurationManager.getInstance().getTestEnvironment();

    switch (testEnv)
    {

        case "prod":
            return "http://apteka24.ua";
        case "ga":
            return "http://a24dev.ga";
        default: return "";
    }
}
}
