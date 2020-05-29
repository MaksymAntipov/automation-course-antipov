package infrastructure.config;

public class ConfigurationManager {

    private static  ConfigurationManager instance;

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance(){
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    private String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
        String envVarValue = System.getenv(envVar);
       return envVarValue != null && !envVarValue.isBlank() ? envVarValue : defaultValue;
    }
    public String getTestBrowser()
    {
        return getEnvironmentVariableOrDefault("testBrowser","chrome");
    }
    public String getTestEnvironment(){return getEnvironmentVariableOrDefault("testEnv","prod");}
    public String getRunOn(){return getEnvironmentVariableOrDefault("runOn","local");

    }
}
