package infrastructure.wdm;

import infrastructure.config.ConfigurationManager;

public class RemoteWebdriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        String browserType = ConfigurationManager.getInstance().getTestBrowser();

        switch (browserType) {
            case "chrome":
                return "REMOTE new ChromeDriver()";
            case "firefox":
                return "REMOTE new FirefoxDriver()";
            default:
                return "";
        }
    }
}
