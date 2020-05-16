package infrastructure;

public class WebDriverManager {

    public String createBrowser() {
        String browserType = ConfigurationManager.getInstance().getTestBrowser();

        switch (browserType) {
            case "chrome":
                return "Google Chrome";
            case "firefox":
                return "Mozilla";
            default:
                return "";
        }
    }
}