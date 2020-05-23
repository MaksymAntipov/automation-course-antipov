package infrastructure;

import infrastructure.logging.FileTestLogger;
import infrastructure.logging.StdTestLogger;
import infrastructure.logging.TestLogger;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;

    protected TestLogger logger;

    public void setup()
    {
        wdm = new WebDriverManager();
        logger = getLogger();
      browser = wdm.createBrowser();

      beforeTest();
    }

    public  void cleanup(){
            afterTest();

        wdm.destroyBrowser(browser);
    }

    protected void beforeTest(){}

    protected void afterTest() {}

    private TestLogger getLogger(){

        return ConfigurationManager.getInstance().getRunEnv().equals("local")?
                new StdTestLogger(): new FileTestLogger();

    }
}
