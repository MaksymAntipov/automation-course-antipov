package infrastructure;

import infrastructure.logging.StdTestLogger;

public class TestBase {

    private WebDriverManager wdm;
    protected String browser;

    protected TestLogger logger;

    public void setup()
    {
        wdm = new WebDriverManager();
        logger = new StdTestLogger();
      browser = wdm.createBrowser();

      beforeTest();
    }

    public  void cleanup(){
            afterTest();

        wdm.destroyBrowser(browser);
    }

    protected void beforeTest(){}

    protected void afterTest() {}
}
