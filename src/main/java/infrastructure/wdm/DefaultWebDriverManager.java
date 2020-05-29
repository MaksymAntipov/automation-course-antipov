package infrastructure.wdm;

import infrastructure.config.ConfigurationManager;

public class DefaultWebDriverManager implements WedDriverManager{
    @Override
    public String getBrowser() {
        String runOn = ConfigurationManager.getInstance().getRunOn();

        switch (runOn){

            case "local":
            case "remote":
            case "cloud":
            default:
                return "";

        }
    }

    @Override
    public void destroyBrowse(String browser) {
        if (browser != null){
            System.out.println(browser+ "quit()");
        }

    }
}
