package infrastructure.base;

import infrastructure.config.ConfigurationManager;
import infrastructure.logging.FileTestLogger;
import infrastructure.logging.StdTestLogger;
import infrastructure.logging.TestLogger;
import infrastructure.wdm.DefaultWebDriverManager;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;

    protected TestLogger logger;

    public void setup()
    {
        wdm = new DefaultWebDriverManager();
        logger = getLogger();
      browser = wdm.getBrowser();

      beforeTest();
    }

    public  void cleanup(){
            afterTest();

        wdm.destroyBrowser(browser);
    }

    protected void beforeTest(){}

    protected void afterTest() {}

    private TestLogger getLogger(){

        return ConfigurationManager.getInstance().getRunOn().equals("local")?
                new StdTestLogger(): new FileTestLogger();

    }
}
