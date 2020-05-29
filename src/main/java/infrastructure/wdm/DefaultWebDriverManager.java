package infrastructure.wdm;

import infrastructure.config.ConfigurationManager;
import infrastructure.wdm.WedDriverManager;
import infrastructure.wdm.factory.CloudWebdriverFactory;
import infrastructure.wdm.factory.LocalWebdriverFactory;
import infrastructure.wdm.factory.RemoteWebdriverFactory;
import infrastructure.wdm.factory.WebDriverFactory;

public class DefaultWebDriverManager implements WedDriverManager {
    @Override
    public String getBrowser() {
        String runOn = ConfigurationManager.getInstance().getRunOn();


        WebDriverFactory factory;

        switch (runOn){
            case "local":
             factory = new LocalWebdriverFactory();
             break;
            case "remote":
                factory = new RemoteWebdriverFactory();
                break;
            case "cloud":
                factory = new CloudWebdriverFactory();
            default:
                return "";
        }
        return  factory.create();
    }

    @Override
    public void destroyBrowse(String browser) {
        if (browser != null){
            System.out.println(browser+ "quit()");
        }
    }
}
