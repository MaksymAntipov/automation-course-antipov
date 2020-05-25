package infrastructure;

import infrastructure.config.ConfigurationManager;

public class WebDriverManager {

    public String createBrowser() {
        String browserType = ConfigurationManager.getInstance().getTestBrowser();

        switch (browserType) {
            case "chrome":
                return "new ChromeDriver()";
            case "firefox":
                return "new FirefoxDriver()";
            default:
                return "";
        }
    }

    public void destroyBrowser (String browser)
    {

        if (browser != null){
            System.out.println(browser+ "quit()");
        }
    }
}