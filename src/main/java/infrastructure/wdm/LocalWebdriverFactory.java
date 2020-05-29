package infrastructure.wdm;

import infrastructure.config.ConfigurationManager;

public class LocalWebdriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        String browserType = ConfigurationManager.getInstance().getTestBrowser();

        switch (browserType) {
            case "chrome":
                return "LOCAL new ChromeDriver()";
            case "firefox":
                return "LOCAL new FirefoxDriver()";
            default:
                return "";
        }
    }
}
