package infrastructure.wdm.factory;

import infrastructure.config.ConfigurationManager;

public class CloudWebdriverFactory implements WebDriverFactory{

    @Override
    public String create()
    {
        String browserType = ConfigurationManager.getInstance().getTestBrowser();

        switch (browserType) {
            case "chrome":
                return "CLOUD new ChromeDriver()";
            case "firefox":
                return "CLOUD new FirefoxDriver()";
            default:
                return "";
        }
    }
}
