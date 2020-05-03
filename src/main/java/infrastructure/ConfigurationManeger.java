package infrastructure;

public class ConfigurationManeger {

    public static String getEnviromentVariableOrDefault(String envVar, String defaultValue) {
        String envVarValue = System.getenv(envVar);
       return System.getenv(envVar) != null && !System.getenv(envVar).isBlank()?
        System.getenv(envVar) : defaultValue;
    }
}